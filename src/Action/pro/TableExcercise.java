package Action.pro;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExcercise 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\USER\\Documents\\Studentsdetail.html");
		driver.manage().window().maximize();
		
		//Total number of rows
		List<WebElement> ls=driver.findElements(By.tagName("tr"));
		int count=ls.size();		
		System.out.println("The number of rows are: "+count);
		
		for(WebElement row:ls)
		{
			List<WebElement> ls1=row.findElements(By.tagName("td"));
			for(WebElement col:ls1)
			{
				System.out.println(col.getText());
			}
		}
		
		
		
		
		
     
	}

}

