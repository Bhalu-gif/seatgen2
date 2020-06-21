package Action.pro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class popup
{
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","C:\\GehFx\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	 
	driver.findElement(By.name("NewWindow")).click();
	   Set s=driver.getWindowHandles();
	   Iterator iter=s.iterator();
	   String maintab=(String) iter.next();
	   String childtab=(String) iter.next();
	 
	   driver.switchTo().window(childtab); //move to child browser window
	   System.out.println(childtab + driver.getTitle());
	   driver.close();
	 
	   driver.switchTo().window(maintab); //move to parent browser window
	   System.out.println(maintab + driver.getTitle());
	   driver.close();
}
}

