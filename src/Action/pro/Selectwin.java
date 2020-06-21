package Action.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectwin 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Select all=new Select(driver.findElement(By.name("url")));
		all.selectByVisibleText("Amazon Fresh");
		System.out.println("complete process");
        
        
	}

}
