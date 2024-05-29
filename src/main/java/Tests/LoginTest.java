package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Framework.utils.PropertiesFileProcessor;
import Page.objects.LoginPage;
//pom este design pattern
import Page.objects.MenuPage;
import Selenium.utils.BaseTest;



public class LoginTest extends BaseTest {
	 String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.propeties");
	 String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.propeties");
	@Test
	public void validLoginTest() {
		
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		menu.navigateTo(menu.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginInApp(USER, PASS);
		
		assertTrue(loginPage.verifycheckMsgIsDisplayed(loginPage.successLoginMsg));
		loginPage.logoutFromApp();
	}
	
	
	

	
	
}
