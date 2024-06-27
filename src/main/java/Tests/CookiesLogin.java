package Tests;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import Framework.utils.PropertiesFileProcessor;
import Page.objects.LoginPage;
import Page.objects.MenuPage;
import Selenium.utils.BaseTest;


public class CookiesLogin extends BaseTest {

	Set<Cookie> cookies;
	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");

	
	@Test(priority = 1)
	public void validLoginTest() {
		
		
		MenuPage menuPage = new MenuPage(driver);		
		//menuPage.navigateTo(menuPage.loginLink);
		menuPage.click(menuPage.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(USER, PASS);
		
		assertTrue(loginPage.checkMsgIsDisplayed(loginPage.successLoginMsg));
		//loginPage.logoutFromApp();
		loginPage.click(loginPage.logoutBtn);
		
	}
	
	@Test(priority = 2)
	public void cookieLogin() throws InterruptedException {
		
		MenuPage menuPage = new MenuPage(driver);	
		menuPage.click(menuPage.loginLink);
		
		for(Cookie cook: cookies) {
			
			
			driver.manage().addCookie(cook);
			
			menuPage.click(menuPage.loginLink);
			
			
		}
		
	}
	
	
}
