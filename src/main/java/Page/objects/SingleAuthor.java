package Page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium.utils.SeleniumWrappers;

public class SingleAuthor extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public SingleAuthor(WebDriver driver) {
		this.driver = driver;
	}
	
	public By percent = By.cssSelector("[class='sc_skills_total']");
	
}