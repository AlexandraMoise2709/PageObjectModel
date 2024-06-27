package Page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Selenium.utils.SeleniumWrappers;

public class ShippingAddressPage extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public ShippingAddressPage(WebDriver driver) {
		this.driver = driver;
	}
	public By countryDropDown = By.id("select2-shipping_country-container");
	public By userName = By.id("username");
	public By pass = By.name("password");
	public By login = By.name("login");
	
	public void loginInAcc(String username, String password) {
		
		sendKeys(userName, username);
		sendKeys(pass, password);
		click(login);
		
	}
	
	public void selectByIndex(int index) {
		WebElement element = driver.findElement(countryDropDown);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
