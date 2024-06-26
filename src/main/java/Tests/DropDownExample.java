package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Page.objects.MenuPage;
import Page.objects.ShopPage;
import Selenium.utils.BaseTest;



public class DropDownExample extends BaseTest{
	
	@Test(priority=1,groups="ShopFunctionality")
	public void selectByValueTest() {
		
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.shopLink);
		
		ShopPage shopPage =  new ShopPage(driver);
		shopPage.selectByValue("date");
		assertEquals(shopPage.getSelectedOption(), "Sort by latest");
		
	}
	
	
	
	@Test(priority=2, groups="ShopFunctionality")
	public void selectByIndexTest() {
		
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.shopLink);
		
		ShopPage shopPage =  new ShopPage(driver);
		shopPage.selectByIndex(1);
		assertEquals(shopPage.getSelectedOption(), "Sort by popularity");
		
	}
	
	@Test(priority=3, groups="ShopFunctionality")
	public void selectByVisibleTextTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.shopLink);
		
		ShopPage shopPage =  new ShopPage(driver);
		shopPage.selectByVisibleText("Sort by price: high to low");;
		assertEquals(shopPage.getSelectedOption(), "Sort by price: high to low");

	}
		
}