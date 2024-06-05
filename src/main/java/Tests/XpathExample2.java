package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Selenium.utils.BaseTest;

public class XpathExample2 extends BaseTest{

	@Test
	public void xpathExamleTest() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement loginPopUp = driver.findElement(By.xpath("//a[@href='#popup_login']/parent::li[@class='menu_user_login']"));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", loginPopUp);
		
		loginPopUp.click();
		
		//descendant
		
		
		WebElement user = driver.findElement(By.xpath("//ul/descendant::input[@id='log']"));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", user);
		
		user.sendKeys("TestCeva");
		
		WebElement pass = driver.findElement(By.xpath("/ul/descendant::form[@name='login_form']/child::div[contains(@class,'password_field')]/child::input"));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", pass);
		
		pass.sendKeys("ceva");
		
		
		WebElement rememberMe= driver.findElement(By.xpath("//ul//div[contains(@class, 'login_field')]/following-sibling::div[contains(@class, 'remember_field')]/child::input"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", rememberMe);
		
		rememberMe.click();
		
		Thread.sleep(3000);
		WebElement user2 = driver.findElement(By.xpath("//ul//div[contains(@class, 'submit_field')]/preceding-sibling::div[contains(@class, 'login_field')]/input"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid red;')", user2);
		
		user2.click();
		
		Thread.sleep(3000);
		WebElement forgoPass = driver.findElement(By.xpath("//a[@href='tel:123-456-7890']/following::a[@class='forgot_password']"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid violet;')", forgoPass);
		
		

		
	}
	
	
	
	
}
