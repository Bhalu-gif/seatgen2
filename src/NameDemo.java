import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameDemo
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		List<WebElement> elements= driver.findElements((By.cssSelector("a.nav-a")));
		System.out.println("number of elements: "+elements.size());
		
		for(int i=0; i<elements.size();i++)
		{
			System.out.println("Radio buttin text: "+elements.get(i).getAttribute("value"));
		}
		

	}

}
