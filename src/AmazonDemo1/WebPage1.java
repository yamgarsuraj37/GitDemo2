package AmazonDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebPage1 {

	
	@Test
	public void allTest() {
	System.setProperty("webdriver.chrome.driver", "D:\\CD_Final\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
     
	
	String webTitle = driver.getTitle();
     System.out.println(webTitle);
    Assert.assertEquals(webTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
   // Assert.assertNotEquals(null, null) ;
	Assert.assertTrue(false, webTitle);
	}	
	
}
