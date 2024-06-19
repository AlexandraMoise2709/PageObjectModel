package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework.utils.PropertiesFileProcessor;
import Page.objects.LoginPage;
import Page.objects.MenuPage;
import Selenium.utils.BaseTest;


public class DataProviderExample extends BaseTest {
	
	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");

	
	@DataProvider//(name = "numeSpecific")
	public Object[][] loginTestData(){
		
		Object[][] data =  new Object[4][3]; // { {1, 2} , {1, 2 } , {1, 2}, {1, 2} }
										//index   [  0 ]   [  1  ]   [  2 ]  [ 3  ]
										//inddex   0   1    0   1     0   1   0  1 
		data[0][0] = USER;
		data[0][1] = PASS;
		data[0][2] = true;
		
		data[1][0] = USER;
		data[1][1] = "ParolaGresita";
		data[1][2] = false;

		
		data[2][0] = USER;
		data[2][1] = PASS;
		data[2][2] = true;

		
		data[3][0] = "UserGresit";
		data[3][1] = PASS;
		data[3][2] = false;

		
		return data;
	}
	

	@Test(dataProvider =  "loginTestData")
	public void loginTest(String username, String password, boolean success) throws InterruptedException {
		
		MenuPage menuPage = new MenuPage(driver);		
		menuPage.click(menuPage.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(username, password);
		Thread.sleep(3000);
		
		if(success) {
			assertTrue(loginPage.checkMsgIsDisplayed(loginPage.successLoginMsg));
			Thread.sleep(3000);
			loginPage.click(loginPage.logoutBtn);
		}else {
			assertTrue(loginPage.checkMsgIsDisplayed(loginPage.errorLoginMsg));
			loginPage.click(loginPage.closeLoginBtn);
		}
		

		
		
	}
	

}