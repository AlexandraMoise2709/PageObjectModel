package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Selenium.utils.BaseTest;

public class ScrollExample extends BaseTest {

	//@Test
	public void scrollByAmount() throws InterruptedException {
		//js executor scrll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2500)");
		//		jse.executeScript("arguments[0].setAttribute"
		//+ "('style', 'background:yellow; border:4px solid green;')", loginPopUp);
		//action class scroll 
		Thread.sleep(4000);	
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0,2500).perform();
		Thread.sleep(4000);		
		actions.scrollByAmount(0,-2500).perform();
		
		
	}
	
	//@Test
	public void scrollToElement() {
		
		Actions actions = new Actions(driver);
		
		WebElement text = driver.findElement(By.xpath("//h4//em[text()='Picked']"));
		//js executor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].scrollIntoView()", text);
		
		
		//action class scroll
		actions.scrollToElement(text).perform();
		//actions.moveToElement(text).perform();
		
		
		
	}
	
	@Test
	public void scrollDownAndTop() throws InterruptedException {
	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.END);
		Thread.sleep(4000);
		actions.sendKeys(Keys.HOME);
		
		
	}
	
}
