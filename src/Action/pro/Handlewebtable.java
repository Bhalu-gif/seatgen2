package Action.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlewebtable
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","F:\\selinium\\firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		
		WebElement hash= driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[4]/td[5]"));
		hash.click();
		System.out.println("webtable successed");
	}

}
