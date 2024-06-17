package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Page.objects.MenuPage;
import Selenium.utils.BaseTest;

public class HomeworkJSExecutor extends BaseTest{
	
	@Test
	public void jseHomework() {
		

		String jsHover = "var obj = document.createEvent('MouseEvent');"
				+ "obj.initMouseEvent('mouseover', true);"
				+ "arguments[0].dispatchEvent(obj);";
		MenuPage menu = new MenuPage(driver);
		
		jse.executeScript(jsHover, menu.getWebElement(menu.blogLink));
		jse.executeScript("arguments[0].click()", menu.getWebElement(menu.postformats));
		
		
		WebElement text = driver.findElement(By.cssSelector("h4 a[href*='gallery-format']"));
		jse.executeScript("arguments[0].scrollIntoView()", text);
		jse.executeScript("arguments[0].click()", text);
		
		WebElement comment = driver.findElement(By.id("comment"));
		WebElement author = driver.findElement(By.id("author"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement submitBTN = driver.findElement(By.id("send_comment"));
		
		jse.executeScript("arguments[0].scrollIntoView()", comment);
		jse.executeScript("arguments[0].value='Hello comment section'",comment);
		jse.executeScript("arguments[0].value='Harry'",author);
		jse.executeScript("arguments[0].value='Harry@email.com'",email);
		jse.executeScript("arguments[0].click()", submitBTN);
}
}