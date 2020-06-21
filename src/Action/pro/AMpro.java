package Action.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AMpro
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl=("https://www.facebook.com/");
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.name("email"));
		WebElement pass=driver.findElement(By.name("pass"));
		
		email.sendKeys("kod23@gmail.com");
		pass.sendKeys("tomjerry@22");
		
		System.out.println("one stage completed");
		email.clear();
		pass.clear();
		
		WebElement sub=driver.findElement((By.name("login")));
		
		
		email.sendKeys("komaldhole145@gmail.com");
		pass.sendKeys("tomjerry@22");
		sub.click();
		
		driver.close();
		
		

		
		
	}

}
