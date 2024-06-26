package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Framework.utils.PropertiesFileProcessor;
import Page.objects.LoginPage;
import Page.objects.MenuPage;
import Selenium.utils.BaseTest;



	
	public class LoginTest extends BaseTest{

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
		public void invalidLoginTest() {
			
			MenuPage menuPage = new MenuPage(driver);		
			menuPage.click(menuPage.loginLink);
			
			LoginPage loginPage = new LoginPage(driver);
			loginPage.loginInApp(USER, "12331231");
			
			assertTrue(loginPage.checkMsgIsDisplayed(loginPage.errorLoginMsg));
			
			
		}
		
		
	}