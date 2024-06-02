package Page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium.utils.SeleniumWrappers;

public class Search  extends SeleniumWrappers{
	public WebDriver driver;
	
	public Search(WebDriver driver) {
		this.driver = driver;
	}
	
	public By searchBTN  = By.cssSelector("button[type='submit'][title='Open search']");
	public By bookKing =By.cssSelector("h6 a[href*='the-wicked-king']");
	public By category=By.cssSelector("span [href*='new-releases']");
	public By productID=By.cssSelector("span[class='product_id']");
	public By galeryPhotos1 =By.cssSelector("li img[src*='TheWickedKing1']");
	public By galeryPhotos2 =By.cssSelector("li img[src*='TheWickedKing2']");
	public By galeryPhotos3 =By.cssSelector("li img[src*='TheWickedKing3']");
	public By galeryPhotos4 =By.cssSelector("li img[src*='TheWickedKing4']");
	
}
