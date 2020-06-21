import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Thander {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\GehFx\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("http://demo.guru99.com/test/web-table-element.php");			
        driver.manage().window().maximize();	
        
        List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size());
        List  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        driver.close();

	}

}
