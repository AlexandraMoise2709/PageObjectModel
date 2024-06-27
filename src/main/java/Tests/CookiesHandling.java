package Tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import Selenium.utils.BaseTest;

public class CookiesHandling extends BaseTest{

	@Test
	public void addCookie () 
	
	
	{
		
//		Cookie cookie = new Cookie("My super cookie", "My super cookie value");
//		driver.manage().addCookie(cookie);
		
		driver.manage().addCookie(new Cookie("Mysupercookie", "My super cookie value"));
		
		
	}
	
	@Test(priority=2)
	public void getCookieNamed() {
		
		Cookie cookie= driver.manage().getCookieNamed("PHPSESSID");
		
		System.out.println(cookie);
		
		
	}
	
	
	@Test(priority=3)
	public void getAllCookies() {
		
		
		Set <Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies);
		
	}
	
	
	@Test(priority=3)
	public void deletecCookieNamed() {
		
		
		driver.manage().deleteCookieNamed("Mysupercookie");
		
		Set <Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies);
		
		
	}
	
	
}
