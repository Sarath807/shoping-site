package shoppingsite;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends Base {

    public void setup() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement viewallproduct = driver.findElement(By.xpath("//a[text()='Home']"));
		viewallproduct.click();
		driver.get("https://ginandjuice.shop/catalog");

        
    }
}