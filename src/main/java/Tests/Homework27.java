package Tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import Page.objects.MenuPage;
import Selenium.utils.BaseTest;

public class Homework27 extends BaseTest {
	
	@Test
	public void clickPeSocialMedia() throws InterruptedException {
	MenuPage menu = new MenuPage(driver);
	
	 menu.click(menu.facebookBtn);
	 
	 List<String> browserTabs = new ArrayList<>(driver.getWindowHandles()); 
	 
	 driver.switchTo().window(browserTabs.get(1));
	 assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/keytraining.ro");
	 Thread.sleep(3000);
	 driver.close();
	 driver.switchTo().window(browserTabs.get(0));
	 Thread.sleep(3000);
	 
	 menu.click(menu.twitterBtn);
	 browserTabs = new ArrayList<>(driver.getWindowHandles());	
	 driver.switchTo().window(browserTabs.get(1));
	 assertEquals(driver.getCurrentUrl(),"https://x.com/?mx=2");	
	 driver.close();
	 driver.switchTo().window(browserTabs.get(0));
	 Thread.sleep(3000);
	 
	 
	 menu.click(menu.instagramBtn);
	 browserTabs = new ArrayList<>(driver.getWindowHandles());	
	 driver.switchTo().window(browserTabs.get(1));
	 assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/");
	 Thread.sleep(3000);
	 driver.close();
	 driver.switchTo().window(browserTabs.get(0));
	 Thread.sleep(3000);
	 

	 
	
	}

}
