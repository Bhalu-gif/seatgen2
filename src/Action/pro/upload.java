package Action.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement upload=driver.findElement(By.cssSelector("input.upload_txt"));
		upload.sendKeys("C:/Users/USER/Documents/new.html");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
