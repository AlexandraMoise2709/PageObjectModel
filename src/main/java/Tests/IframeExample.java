package Tests;


import org.testng.annotations.Test;

import Page.objects.ContactsPage;
import Page.objects.MenuPage;
import Selenium.utils.BaseTest;

public class IframeExample extends BaseTest{
	
	
	@Test
	public void iframeExampleTest() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		menu.click(menu.contactsLink);
				
		ContactsPage contactPage =  new ContactsPage(driver);
		
		driver.switchTo().frame(driver.findElement(contactPage.iframe));
		contactPage.click(contactPage.zoomInBtn);
		contactPage.click(contactPage.zoomInBtn);

		driver.switchTo().defaultContent();
		contactPage.sendKeys(contactPage.nameField, "Test Test");

	}
	

}
	

