package Selenium.utils;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.google.common.io.Files;

public class BaseTest {
public static WebDriver driver;
public static JavascriptExecutor jse;

	@Parameters({"appUrl"})
	@BeforeClass (alwaysRun = true)
	public void setup(String url) {
		
		driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
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
	
	@AfterMethod
	public void recordFailure(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			TakesScreenshot obj = (TakesScreenshot) driver;
			File picture = obj.getScreenshotAs(OutputType.FILE);
			
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
			
			try {
				
				Files.copy( picture, new File("Poze/"+result.getName()+ "-"+ timestamp +".png" ));
				
				
			}catch(Exception e) {
				
				
				e.printStackTrace();
			}
			
		}
	}

	
}
