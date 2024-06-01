package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Page.objects.MenuPage;
import Page.objects.SingleAuthor;
import Selenium.utils.BaseTest;

public class SingleAuthorTest extends BaseTest{ 
	
	@Test(priority = 1)
		public void validTest() {
			
			MenuPage menuPage = new MenuPage(driver);		
			menuPage.click(menuPage.singleAuthorLink);			

			SingleAuthor singleAuthor = new SingleAuthor(driver);
		//	singleAuthor.getStyle(singleAuthor.widthSyle, "style");
			
			System.out.println(singleAuthor.getText(singleAuthor.widthSyle));
			System.out.println(singleAuthor.getText(singleAuthor.label));
		}

}
