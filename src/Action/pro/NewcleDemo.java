package Action.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewcleDemo
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","F:\\selinium\\firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		 
		 
		 
	}

}
