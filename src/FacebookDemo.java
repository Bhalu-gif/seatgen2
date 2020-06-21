import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dipali");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_o")).sendKeys("shrma");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.findElement(By.name("reg_email__")).sendKeys("dipalishr@123.com");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_y")).sendKeys("dipa@123");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		Select selectday = new Select(driver.findElement(By.id("day")));
		selectday.selectByVisibleText("23");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Select selectmonth =new Select(driver.findElement(By.name("birthday_month")));
		selectmonth.selectByVisibleText("Mar");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Select selectyear =new Select(driver.findElement(By.id("year")));
		selectyear.selectByVisibleText("1994");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("sex")).click();
	    
		
		
		driver.findElement(By.xpath("//*[@id='u_0_15']")).click();
		
		
		
		
  		
		
		
	}

}
