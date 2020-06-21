package Action.pro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwindows {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("cusid")).sendKeys("1234890");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();		
		
		 String alertMessage= driver.switchTo().alert().getText();
		 System.out.println(alertMessage);	
		 alert.accept();		
		

	}

}
