package Action.pro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookie1 
{
	 public static void main(String[] args)		
	    {
	    	WebDriver driver;	
	    	System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();      
			driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");

	       				
	        // Input Email id and Password If you are already Register		
	        driver.findElement(By.name("username")).sendKeys("abc123");							
	        driver.findElement(By.name("password")).sendKeys("123xyz");							
	        driver.findElement(By.name("submit")).click();					
	        		
	        // create file named Cookies to store Login Information		
	        File file = new File("Cookies.data");							
	        try		
	        {	  
	            // Delete old file if exists
				file.delete();		
	            file.createNewFile();			
	            FileWriter fileWrite = new FileWriter(file);							
	            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
	            // loop for getting the cookie information 		
	            	
	            Set<Cookie> cookies=driver.manage().getCookies();
	            for(Cookie ck : cookies)							
	            {			
	            	
	                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
	                Bwrite.newLine(); 
	                System.out.println("The name of cookie is: "+ck.getName());
	                
	                
	            }	
	            
	            Bwrite.close();			
	            fileWrite.close();	
	            
	        }
	        catch(Exception ex)					
	        {		
	            ex.printStackTrace();			
	        }		
	    }		
	}


