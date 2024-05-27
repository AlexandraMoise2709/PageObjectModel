package Tests;

import org.testng.annotations.Test;
//pom este design pattern
import Page.objects.MenuPage;
import Selenium.utils.BaseTest;

public class LoginTest extends BaseTest {
	@Test
	public void validLoginTest() {
		
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		menu.navigateTo(menu.loginLink);

	}
	
	
}
