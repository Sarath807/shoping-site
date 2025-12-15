package shoppingsite;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;


public class ProductPage2 extends Base {
	@Test (priority=1)

	

	    public void completeOrderFlow() {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

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
	       
	      
	        // ------------------ 3. VIEW PRODUCT ------------------
	        driver.navigate().to("https://ginandjuice.shop/catalog");
	        
	        WebElement firstProduct = driver.findElement(
	                By.xpath("//html/body/div[2]/section/div/section[3]/a[1]/span[2]"));
	        firstProduct.click();
	        
	        //
	        WebElement locationDropdown = wait.until(
	                ExpectedConditions.elementToBeClickable(By.tagName("select"))
	        );
	        Select locationSelect = new Select(locationDropdown);
	        locationSelect.selectByVisibleText("Milan"); 
	        
	        WebElement Locationchange = driver.findElement(
	                By.xpath("//*[@id=\"stockCheckForm\"]/button"));
	        Locationchange.click();
	        
	        
	    

	        // ------------------ 4. ADD TO CART ------------------
	       
	        WebElement quantityDropdown = wait.until(
	        		   ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addToCartForm\"]/select"))
	        		);

	        // Create Select object
	        Select quantitySelect = new Select(quantityDropdown);

	        // Select number 3
	        quantitySelect.selectByVisibleText("3");
	        
	        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(
	              By.xpath("//*[@id=\"addToCartForm\"]/button")));
	          addToCart.click();
	        
	        
	             

	        // ------------------ 4. VIEW CART ------------------
	       
	        
	        WebElement oderbutton = wait.until(ExpectedConditions.elementToBeClickable(
	               By.xpath("/html/body/div[2]/section/div/section/div[2]/span[5]")));
	        oderbutton.click();
	        
	        WebElement couppon = driver.findElement(By.xpath("//*[@id=\"coupon-form\"]/input[2]"));
	        couppon .sendKeys("9In&JUICE5H0P");
			 WebElement  Applycoupon = driver.findElement(By.xpath("//*[@id=\"coupon-form\"]/button"));
			 
			 Applycoupon.click();
        
	        
	        
	        

	    


	        // ------------------ 4. PLACE ODER ------------------
	       
	      /*
	        
	        driver.navigate().to("https://ginandjuice.shop/login");
	        WebElement usernameField = driver.findElement(By.xpath("/html/body/div[2]/section/div/section/form/input[2]"));
			 usernameField.sendKeys("carlos");
			 WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/section/div/section/form/button"));
			 
			 loginButton.click();
			 WebElement passwordfield = driver.findElement(By.xpath("/html/body/div[2]/section/div/section/form/input[3]"));
			 passwordfield.sendKeys("hunter2");
			 
			 WebElement loginButton1 = driver.findElement(By.xpath("/html/body/div[2]/section/div/section/form/button"));
			 
			 loginButton1.click();
*/
	        
	        
	        
	        
	        
           // -------- OPTIONAL: REMOVE FROM CART (if required) --------
	        WebElement removecartitem = wait.until(ExpectedConditions.elementToBeClickable(
	        	   By.xpath("/html/body/div[2]/section/div/div/div[1]/div/span[3]")));
	        	removecartitem.click();
	        	
	        	
	        	
	        	

	        	
	    }
	}
	


