package Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Page.objects.ContactsPage;
import Page.objects.MenuPage;
import Selenium.utils.BaseTest;

public class ActionClassExample2 extends BaseTest{
	
	
	public void sendKeysEample(){    
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.contactsLink);
		
		
		ContactsPage contactPage = new ContactsPage(driver);
		WebElement nameField = driver.findElement(contactPage.nameField);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(nameField)
				.click()
				.keyDown(Keys.SHIFT)
				.sendKeys(nameField, "test")
				.keyUp(Keys.SHIFT)
				.sendKeys(Keys.TAB,"email@email.com")
				.sendKeys(Keys.TAB,"subjectc")
				.sendKeys(Keys.TAB,"phone")
				.sendKeys(Keys.TAB,"message")
				.sendKeys(Keys.TAB,Keys.ENTER)
				.perform();
	}
	
	@Test
	public void sendKeysExample2() throws InterruptedException {
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.contactsLink);
		
		
		ContactsPage contactPage = new ContactsPage(driver);
		WebElement nameField = driver.findElement(contactPage.nameField);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(nameField)
				.sendKeys(nameField, "aBRACADABRA")
				.keyDown(Keys.SHIFT)
				.sendKeys(Keys.ARROW_RIGHT)
				.sendKeys(Keys.ARROW_UP)
				.keyUp(Keys.SHIFT)
				
				.sendKeys(Keys.COMMAND)
				.sendKeys("c")
				.keyUp(Keys.CONTROL)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.CONTROL)
				.sendKeys("v")
				.sendKeys(Keys.COMMAND)
				.perform();
		
		Thread.sleep(4000);
	}
	

}
