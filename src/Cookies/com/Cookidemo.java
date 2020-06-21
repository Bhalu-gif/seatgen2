package Cookies.com;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cookidemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("The number of cookies are: "+cookies.size());
		
		for(Cookie cookie:cookies)
		{
			System.out.println("The name of cookie is: "+cookie.getName());
			System.out.println("The domain of cookie is: "+cookie.getDomain());
			System.out.println("The value of cookie is: "+cookie.getValue());
			System.out.println("The class of cookie is: "+cookie.getClass());
			System.out.println("The path of cookie is "+cookie.getPath());
			System.out.println("The expiry date of cookie is: "+cookie.getExpiry());
			System.out.println("Verify isSecure "+cookie.isSecure());
			System.out.println("Verify isHttpOnly: "+cookie.isHttpOnly());
			
		}
		
		driver.manage().deleteCookieNamed("T");
		
		Cookie cookie =driver.manage().getCookieNamed("SN");
		System.out.println("cookie name is"+cookie.getName());
		
		Cookie username= new Cookie("username","Suvidya");
		driver.manage().addCookie(username);
		System.out.println("username cookie value is:"+username.getValue());
		
		Cookie password =new Cookie("password","P@ssword1234");
		driver.manage().addCookie(password);
		System.out.println("password cookie value is: "+password.getValue());
		
		
		
		

}
}
