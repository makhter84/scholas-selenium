

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class GRID1 {
	WebDriver driver;
	String baseURL, nodeURL;
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		baseURL="http://www.google.com";
		nodeURL="http://10.14.226.241:5556/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WIN8_1);
		
		driver = new RemoteWebDriver(new URL(nodeURL), capability);
		
		
		
		
	}
	
	@AfterTest
	public void afterTest(){
		driver.quit();
	}
	
	@Test
	public void simpleTest(){
		driver.get(baseURL);
		Assert.assertEquals("Google", driver.getTitle());
		System.out.println("In Test");
	}
	
}