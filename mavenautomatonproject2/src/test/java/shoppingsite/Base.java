package shoppingsite;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	WebDriver driver;
	@BeforeMethod
	public void intializeBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
		public void login() {
			driver.get("https://ginandjuice.shop/");
			
		}
	@AfterMethod
		public void quitBrowser() {
			if (driver != null) {
				driver.quit();
			}
	}

}
