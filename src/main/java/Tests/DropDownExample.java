
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Page.objects.MenuPage;
import Selenium.utils.BaseTest;
import Page.objects.ShopPage;



public class DropDownExample extends BaseTest{
	
	@Test(priority=1)
	public void selectByValueTest() {
		
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.shopLink);
		
		ShopPage shopPage =  new ShopPage(driver);
		shopPage.selectByValue("date");
		assertEquals(shopPage.getSelectedOption(), "Sort by latest");
		
	}
	
	
	
	@Test(priority=2)
	public void selectByIndexTest() {
		
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.shopLink);
		
		ShopPage shopPage =  new ShopPage(driver);
		shopPage.selectByIndex(1);
		assertEquals(shopPage.getSelectedOption(), "Sort by popularity");
		
	}
	
	@Test(priority=3)
	public void selectByVisibleTextTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.shopLink);
		
		ShopPage shopPage =  new ShopPage(driver);
		shopPage.selectByVisibleText("Sort by price: high to low");;
		assertEquals(shopPage.getSelectedOption(), "Sort by price: high to low");

	}
		
}