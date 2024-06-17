package Selenium.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
public static WebDriver driver;
public static JavascriptExecutor jse;

	@Parameters({"appUrl"})
	@BeforeClass (alwaysRun = true)
	public void setup(String url) {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		//driver.get("https://keybooks.ro");
		driver.get(url);
		jse = (JavascriptExecutor) driver;
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() throws InterruptedException  {
		Thread.sleep(5000);//bad practice
		driver.quit();
	}

	
}
