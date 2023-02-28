package AmazonDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebPage2 {
	public WebDriver driver;

	@BeforeTest
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\CD_Final\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void launch() {
		driver.get(
				"https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("810839698");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();

	}

	@Test
	public void nextStep() {
		System.out.println(driver.findElement(By.xpath("//*[text()='Incorrect phone number']")).getText());

	}

}
