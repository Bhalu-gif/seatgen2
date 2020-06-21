import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplw23 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(5000);
		
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println("Alert message in pop up window: "+alertmsg);
	
		
		driver.switchTo().alert().accept();
		
		boolean flag=driver.findElement(By.xpath("//input[@name='proceed']")).isDisplayed();
		System.out.println("Go button is displayed: "+flag);
		
        driver.close();
	}

}

