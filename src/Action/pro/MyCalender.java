package Action.pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyCalender 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\GehFx\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://demo.guru99.com/test/");

    //Find the date time picker control

    WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

   

    dateBox.sendKeys("09252013");

    //Press tab to shift focus to time field

    dateBox.sendKeys(Keys.TAB);

    //Fill time as 02:45 PM

    dateBox.sendKeys("0245PM");

}
}
