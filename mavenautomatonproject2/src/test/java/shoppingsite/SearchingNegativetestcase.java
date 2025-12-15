package shoppingsite;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchingNegativetestcase extends Base {
	@Test 
	 public void search() {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        
	        driver.navigate().to("https://ginandjuice.shop/");
	        // ------------------ 1. OPEN PRODUCT PAGE ------------------
	        driver.navigate().to("https://ginandjuice.shop/");
	        WebElement productButton = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//*[@id=\"scanMeHeader\"]/section[2]/div/div/nav/ul[1]/li[1]/a")));
	        productButton.click();
	        // ------------------ 2. SEARCH PRODUCT ------------------
	        WebElement searchproduct = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//*[@id=\"searchBar\"]")));
	        searchproduct.sendKeys("Fruit Overlays");
	        
	        WebElement searchIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("/html/body/div[2]/section/div/section[1]/form/button")));
	        searchIcon.click();
	        
	        

}
}
