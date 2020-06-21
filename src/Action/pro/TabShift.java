package Action.pro;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabShift 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","C:\\GehFx\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        
        
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        System.out.println(tabs2.size());
        driver.switchTo().window((String) tabs2.get(0)); 
        
        
        driver.get("http://bing.com");
        
        
        driver.switchTo().window((String)tabs2.get(1));
        
        
		//driver.switchTo().window(windowHandle);
        driver.switchTo().window((String)tabs2.get(0));
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
        driver.switchTo().defaultContent();


	}
}
