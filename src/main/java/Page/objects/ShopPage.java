package Page.objects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Selenium.utils.SeleniumWrappers;


public class ShopPage extends SeleniumWrappers{
	
	public static WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	public By sortingDropdown = By.name("orderby");
	public By priceSliderLeft = By.xpath("//span[@style='left: 0%;']");
	public By priceSliderRight = By.xpath("//span[@style='left: 100%;']");
	public By priceElement= By.xpath("//span[@class='woocommerce-Price-amount amount']");
	public By categorieCarti = By.tagName("Romans");
	
	////span[not(contains(@class, 'aria-hidden'))]
	
	public void selectByValue(String value) {
		WebElement element = driver.findElement(sortingDropdown);
		Select select = new Select(element);
		select.selectByValue(value);	
	}
	
	
	public void selectByIndex(int index) {
		WebElement element = driver.findElement(sortingDropdown);
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectByVisibleText(String visibleText) {
		WebElement element = driver.findElement(sortingDropdown);
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);	
	}
	
	
	
	public String getSelectedOption() {
		WebElement element = driver.findElement(sortingDropdown);
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();	
	}
	
	public By pickCategory(String text) {
		
		 return By.xpath("//a[text()='" + text + "']");		
		
	}
	
	public By bookFinder(String book) {		
		 return By.cssSelector("h2 [href*='" + book + "']");		
	}
	
	public String createUrl (String book) {		
		String url = "https://keybooks.ro/shop/" + book;		
		 return url;
		
	}
	
	
    public static By getCatCarte(String text) {
        return By.xpath("//a[text()='" + text + "']");
    }
    
    public static String linkText(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
    
	

	
}