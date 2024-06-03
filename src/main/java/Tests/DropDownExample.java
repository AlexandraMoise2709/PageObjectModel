package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Page.objects.MenuPage;
import Page.objects.ShopPage;
import Selenium.utils.BaseTest;

public class DropDownExample extends BaseTest {

	@Test(priority = 1)
	
	public void selectByValueTest() {
		

		MenuPage menuPage = new MenuPage(driver);		
		menuPage.click(menuPage.loginLink);
		
		

		ShopPage shopPage = new ShopPage(driver);		
		
		shopPage.selectByValue("date");
		assertEquals(shopPage.getSelectedOption(),"Sort by latest");
		
	}
	
	
	
	
}
