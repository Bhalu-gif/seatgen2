import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\GehFx\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/USER/Documents/ug.html");			
        driver.manage().window().maximize();
        
        int r= driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
        System.out.println(r);
        
        int c = driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
        System.out.println(c);
        
        for(int i=2;i<=r;i++)
        {
        	for(int j=1;j<=c;j++)
        	{
        		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText());
        	}
        }
        
	}

}
 