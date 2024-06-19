package Tests;

import Page.objects.ContactsPage;
import Page.objects.MenuPage;
import Selenium.utils.BaseTest;

public class IframeExample extends BaseTest {
	
	
	public void iframeExampleTest() throws InterruptedException {
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.contactsLink);
		
		
		
		ContactsPage contactpage = new ContactsPage(driver);
	
		
		driver.switchTo().frame(driver.findElement(contactpage.iFrame));
		contactpage.click(contactpage.zoomInBtn);
		contactpage.click(contactpage.zoomInBtn);
		
	}

}
