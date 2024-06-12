package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Page.objects.MenuPage;
import Selenium.utils.BaseTest;

public class JavaScriptExecutorTest extends BaseTest{


	public void example1() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//driver.get("https://www.keybooks.ro");
		//driver.navigate().to("url");
		jse.executeScript("window.location='https://www.keyfood.ro'");
		
		//driver.navigate().back();
		jse.executeScript("window.history.go(-1)");
		
		driver.navigate().forward();
		jse.executeScript("window.history.go(+1)");
		
		driver.navigate().refresh();
		jse.executeScript("window.history.go(0)");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.F5).perform();
		driver.get(driver.getCurrentUrl());
	}
	
		//@Test
	public void example2() {
		MenuPage menu = new MenuPage(driver);
//		jse.executeScript("arguments[0].click()", menu.getWebElement(menu.iconSearch));
//		
//		
//		jse.executeScript("arguments[0].click();"+"arguments[0].value='cooking;"+"arguments[0].click()",
//				menu.getWebElement(menu.iconSearch), 
//				menu.getWebElement(menu.iconField));
//	
		
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		jse.executeScript("document.getElementsByClassName('search_field')[0].value='cooking'");
		
		String visible = jse.executeScript("return document.getElementsByClassName('post_title')[0].checkVisibility()").toString();
		System.out.println(visible);
		
		String bookTitle = jse.executeScript("return document.getElementsByClassName('post_title')[0].childNodes[0].innerText").toString();
		System.out.println(bookTitle);
		
		//document.getElementsByClassName('post_title')[0].childNodes[0].click()


		String curentUrl =jse.executeScript("return document.URL").toString();
		System.out.println(curentUrl);
		
		assertEquals(curentUrl,"https://keybooks.ro/shop/a-hundred-and-one-receipes/");
		jse.executeScript("document.getElementById('tab-title-reviews').children[0].click()");
		
		jse.executeScript("window.scrollBy(0, 900)");
		
	}
		
		

		@Test
	public void example3() {
			
			System.out.println(driver.getTitle());
			
			String schimbTitlulPaginii = "window.obj = function() {document.title = 'Am schimbat functia mea'};" + "window.obj.call();";
			
			jse.executeScript(schimbTitlulPaginii);
			
			System.out.println(driver.getTitle());
			
			
}}
