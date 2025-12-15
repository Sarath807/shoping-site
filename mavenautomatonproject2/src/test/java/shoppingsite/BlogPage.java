package shoppingsite;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BlogPage  extends Base{
	@Test (priority=2)
	 public void Blog() {
		 
	

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    // ------------------ 1. OPEN BLOG PAGE ------------------
    driver.navigate().to("https://ginandjuice.shop/");
    WebElement blogButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"scanMeHeader\"]/section[2]/div/div/nav/ul[1]/li[2]/a")));
    blogButton.click();
    
    // ------------------ 2. SEARCH PRODUCT ------------------
    WebElement searchproduct = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("/html/body/div[2]/section/div/section[1]/form/input[1]")));
    searchproduct.sendKeys("A Hairy Day");
    
    WebElement searchIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("/html/body/div[2]/section/div/section[1]/form/button")));
    searchIcon.click();
    

    // ------------------ 1. OPEN OUR STORY PAGE ------------------
    driver.navigate().to("https://ginandjuice.shop/");
    WebElement storyButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"scanMeHeader\"]/section[2]/div/div/nav/ul[1]/li[3]/a")));
    storyButton.click();


}
}
