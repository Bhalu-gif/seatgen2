import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupWindow 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.gecko.driver","C:\\GehFx\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();	
		driver.get("http://demo.guru99.com/popup.php");			
        driver.manage().window().maximize();	
        

          driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
          String MainWindow=driver.getWindowHandle();
          Set<String> s1= driver.getWindowHandles();
          Iterator itr =s1.iterator();
          while(itr.hasNext())
          {
        	  String ChildWindow=(String) itr.next();
        	  if(!MainWindow.equalsIgnoreCase(ChildWindow))			
              {    		
                   
                     
                      driver.switchTo().window(ChildWindow);	                                                                                                           
                      driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                      Thread.sleep(3000);
                      driver.findElement(By.name("btnLogin")).click();
                      driver.close();	
                      
                      
              }
                   
          }
          driver.switchTo().window(MainWindow);	

	}

}
