package Action.pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Reddif {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Actions builder =new Actions(driver);
		
		WebElement usr=driver.findElement(By.id("login1"));
		builder.moveToElement(usr).build().perform();
		Thread.sleep(3000);
		
		Action seriesOfActions;
		seriesOfActions =  builder.keyDown(usr, Keys.SHIFT).sendKeys(usr, "komal").sendKeys(usr,"Dhole").keyUp(usr,Keys.SHIFT).build();
	
		seriesOfActions.perform();
		Thread.sleep(3000);
		driver.quit();seriesOfActions.perform();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}

}
