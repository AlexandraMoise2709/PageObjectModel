package Page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

	public WebDriver driver;
	public MenuPage(WebDriver driver) {		
		
		this.driver = driver;
	}
	
	//driver.findElement(By.linkText('Login'));//element
	
	public By loginLink = By.linkText("Login");//locator
	public By shopLink = By.linkText("BOOKS");
			
			
			public void navigateTo(By locator) {				
				driver.findElement(locator).click();
				
			}
}
