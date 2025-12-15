package shoppingsite;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginValidationPositiveTestcase extends Base {
	
	@Test 
	
	public void loginWithInvalidCridential() {
		 
		 driver.navigate().to("https://ginandjuice.shop/login");
		 // Locate username, password fields and login button
		 
		 
		 WebElement usernameField = driver.findElement(By.xpath("/html/body/div[2]/section/div/section/form/input[2]"));
		 usernameField.sendKeys("sam");
		 WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/section/div/section/form/button"));
		 
		 loginButton.click();
		 WebElement passwordfield = driver.findElement(By.xpath("/html/body/div[2]/section/div/section/form/input[3]"));
		 passwordfield.sendKeys("hunter2");
		 
		 WebElement loginButton1 = driver.findElement(By.xpath("/html/body/div[2]/section/div/section/form/button"));
		 
		 loginButton1.click();
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait1.until(ExpectedConditions.elementToBeClickable(loginButton));

	}

		
		
		
		
	}
	
	
	