package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Framework.utils.PropertiesFileProcessor;
import Page.objects.LoginPage;
import Page.objects.MenuPage;
import Page.objects.ShippingAddressPage;
import Selenium.utils.BaseTest;



public class Homework22 extends BaseTest {
	
	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");
	@Test
	public void shipAdressValidation() {
	
		Actions action = new Actions(driver);

	driver.get("https://keybooks.ro/account/edit-address/shipping/");	
	ShippingAddressPage shpAdr = new ShippingAddressPage(driver);
	shpAdr.loginInAcc(USER, PASS);
	WebElement element = driver.findElement(By.id("select2-shipping_country-container"));
	Select select =  new Select(element);
	
	select.selectByIndex(22);
	//action.sendKeys(Keys.ENTER);
	
	
	

}
}