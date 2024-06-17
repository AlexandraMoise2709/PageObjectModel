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
	@DataProvider
	public Object[][]loginTestData(){
		
		 Object[][] data =new Object[4][3]; //{{1,2},{2,3},{1,2},{1,2}}
		 									//	[0]   [1]	[2]		[3]
		 									//  0 1   0 1   0 1   0  1
		 
		 data[0][0]=USER;
		 data[0][1]=PASS;
		 data[0][2]=true;
		 
		 data[1][0]=USER;
		 data[1][1]="PAROLAGRESITA";
		 data[1][2]=false;
		 
		 
		 data[2][0]=USER;
		 data[2][1]=PASS;
		 data[2][2]=true;
		 
		 data[3][0]="USERGRESIT";
		 data[3][1]=PASS;
		 data[3][2]=false;
		 
		return data;
		 
	}
	
	@Test(dataProvider="loginTestData")
	public void loginTest(String username, String password, boolean success) {
		
		MenuPage menuPage = new MenuPage(driver);		
		menuPage.click(menuPage.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(username, password);
		
		if(success) {
		
		assertTrue(loginPage.checkMsgIsDisplayed(loginPage.successLoginMsg));
		loginPage.click(loginPage.logoutBtn);
		} else assertTrue(loginPage.checkMsgIsDisplayed(loginPage.errorLoginMsg));
		loginPage.click(loginPage.closeLoginBtn);
		
	}
	
}
