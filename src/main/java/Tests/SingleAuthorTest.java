package Tests;

import static org.testng.Assert.assertEquals;
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
			System.out.println(singleAuthor.getElementListTexts(singleAuthor.percent).get(1));
			
			assertEquals(singleAuthor.getElementListTexts(singleAuthor.percent).get(0),"95%");
			assertEquals(singleAuthor.getElementListTexts(singleAuthor.percent).get(1),"75%");
			assertEquals(singleAuthor.getElementListTexts(singleAuthor.percent).get(2),"82%");
		}

}
