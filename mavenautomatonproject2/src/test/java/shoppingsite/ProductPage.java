package shoppingsite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends LoginAutomation {
	
	public void product () {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement productpagebutton = driver.findElement(By.xpath("//*[@id=\"scanMeHeader\"]/section[2]/div/div/nav/ul[1]/li[1]/a"));
			productpagebutton.click();
			
			
			driver.get("https://ginandjuice.shop/catalog");
			
		
	}
	
	
}
