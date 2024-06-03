package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Page.objects.LoginPage;
import Page.objects.MenuPage;
import Selenium.utils.BaseTest;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SearchTest extends BaseTest{

	@Test(priority = 1)
		public void searchItem() {
			
			MenuPage search = new MenuPage(driver);		
			//menuPage.navigateTo(menuPage.loginLink);
			//search.click(search.searchBTN);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(search.searchBTN));
			search.sendKeys(search.searchBTN, " king ");
			search.click(search.bookKing);
			
			assertEquals(search.getElementText(search.category),"New releases");
			assertEquals(search.getElementText(search.productID),"Product ID: 1709");
			
			assertTrue(search.elementIsDisplayed(search.galeryPhotos1));
			assertTrue(search.elementIsDisplayed(search.galeryPhotos2));
			assertTrue(search.elementIsDisplayed(search.galeryPhotos3));
			assertTrue(search.elementIsDisplayed(search.galeryPhotos4));
			
			
			
		}
	
}
