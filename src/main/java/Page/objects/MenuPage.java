package Page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium.utils.SeleniumWrappers;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class MenuPage extends SeleniumWrappers{

	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//driver.findElement(By.linkText('Login'));
	public By loginLink = By.linkText("Login");
	public By shopLink = By.linkText("BOOKS");
	public By contactsLink = By.linkText("CONTACTS");
	public By singleAuthorLink = By.linkText("SINGLE AUTHOR");
	public By blogLink = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By postformats = By.cssSelector("li[id*='232'] a[href*='post-formats']");
	
	public By searchBTN  = By.cssSelector("button[type='submit'][title='Open search']");
	public By bookKing =By.cssSelector("h6 a[href*='the-wicked-king']");
	public By category=By.cssSelector("span [href*='new-releases']");
	public By productID=By.cssSelector("span[class='product_id']");
	public By iconField=By.cssSelector("div[class='top_panel_middle'] input");
	public By facebookBtn=By.cssSelector("div a[href*='facebook']");
	public By twitterBtn=By.cssSelector("div a[href*='twitter']");
	public By instagramBtn=By.cssSelector("div a[href*='instagram']");
	
	
	
	public By iconSearch = By.cssSelector("div[class='top_panel_middle'] button[class*='icon-search']");
	public By searchField = By.cssSelector("div[class='top_panel_middle'] input");

	public By galeryPhotos1 =By.cssSelector("li img[src*='TheWickedKing1']");
	public By galeryPhotos2 =By.cssSelector("li img[src*='TheWickedKing2']");
	public By galeryPhotos3 =By.cssSelector("li img[src*='TheWickedKing3']");
	public By galeryPhotos4 =By.cssSelector("li img[src*='TheWickedKing4']");
	
	
	public void search(String searchValue) {
		
		click(iconSearch);
		sendKeys(searchField,searchValue);
		click(iconSearch);
	}

	
	
	
}