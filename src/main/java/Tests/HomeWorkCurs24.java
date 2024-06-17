package Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Page.objects.MenuPage;
import Page.objects.ShopPage;
import Selenium.utils.BaseTest;

@Test
public class HomeWorkCurs24 extends BaseTest {

	public void sortarePriceToLow() {
	MenuPage menupage = new MenuPage(driver);
	Actions action = new Actions(driver);
	
	
	WebElement shopLink = driver.findElement(menupage.shopLink);
	action.moveToElement(shopLink)
			.click()
			.perform();
	
	ShopPage shoppage = new ShopPage(driver);
	WebElement sortingDropdown = driver.findElement(shoppage.sortingDropdown);
	action.moveToElement(sortingDropdown)
			.click()
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ENTER)
			.perform();
	
	

	
	
	WebElement priceElement= driver.findElement(By.xpath("//span[@class='woocommerce-Price-amount amount']"));
	action.moveToElement(priceElement);

		String firstPrice = shoppage.getElementTexts(shoppage.priceElement).get(0).replaceAll("[^0-9.]", "");
		String lastPrice = shoppage.getElementTexts(shoppage.priceElement).get(20).replaceAll("[^0-9.]", "");

		System.out.println(firstPrice);
		System.out.println(lastPrice);
		
		assertTrue(Double.parseDouble(firstPrice) < Double.parseDouble(lastPrice));

}
}
