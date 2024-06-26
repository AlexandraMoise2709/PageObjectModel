package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Page.objects.MenuPage;
import Page.objects.ShopPage;
import Selenium.utils.BaseTest;


public class Homework26 extends BaseTest {
	
	@Test
	public void categorieCarte() throws InterruptedException {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.shopLink);
		
		
		ShopPage shopPage = new ShopPage(driver);
		Thread.sleep(3000);
		shopPage.click(shopPage.pickCategory("Romans"));
		driver.navigate().back();
		
		shopPage.click(shopPage.bookFinder("a-banquet-of-mouse"));
		assertEquals(driver.getCurrentUrl(),shopPage.createUrl("a-banquet-of-mouse/"));
		Thread.sleep(3000);
		assertEquals(ShopPage.linkText(ShopPage.getCatCarte("Romans")),"Romans");
		driver.navigate().back();
		
		shopPage.click(shopPage.bookFinder("life-in-the-garden"));
		assertEquals(driver.getCurrentUrl(),shopPage.createUrl("life-in-the-garden/"));
		Thread.sleep(3000);
		assertEquals(ShopPage.linkText(ShopPage.getCatCarte("Romans")),"Romans");
		driver.navigate().back();
		
		shopPage.click(shopPage.bookFinder("the-son"));
		assertEquals(driver.getCurrentUrl(),shopPage.createUrl("the-son/"));
		Thread.sleep(3000);
		assertEquals(ShopPage.linkText(ShopPage.getCatCarte("Romans")),"Romans");
		driver.navigate().back();
		
		
	}
		
		

}
