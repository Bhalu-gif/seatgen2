import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String baseurl="https://www.amazon.in";
        String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualtitle=" ";

driver.get(baseurl);
actualtitle = driver.getTitle();
if (actualtitle.contentEquals(expectedtitle)){
    System.out.println("Test Passed!");
} else {
    System.out.println("Test Failed");
}


driver.close();

	}

}
