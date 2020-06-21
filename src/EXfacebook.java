import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXfacebook {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement usernm = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement password=driver.findElement(By.cssSelector("input[id='pass']"));
		usernm.sendKeys("komal234@gmail.com");
		password.sendKeys("tom@44");
		System.out.println("Text Field Set");
		
		usernm.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");
        
        WebElement login=driver.findElement(By.id("u_0_2"));
        
        usernm.sendKeys("komaldhole145@gmail.com");
		password.sendKeys("tomjerry@22");
		login.click();
		System.out.println("Login Done with Click");
		
		
		driver.get("https://www.facebook.com");					
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("komaldhole145@gmail.com");						
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("tomjerry@22");							
        driver.findElement(By.id("u_0_2")).submit();					
        System.out.println("Login Done with Submit");	
		
		driver.close();
		
		
        
	}

}
