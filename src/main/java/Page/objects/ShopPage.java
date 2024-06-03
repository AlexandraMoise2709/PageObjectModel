package Page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Selenium.utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers {

	public WebDriver driver;
	
	public  ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By sortingDropdown = By.name("orderby");
	
	public void selectByValue(String value) {
		
		WebElement element = driver.findElement(sortingDropdown);
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public String getSelectedOption() {
		
		WebElement element = driver.findElement(sortingDropdown);
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();

	}
	
	
	
	
}
