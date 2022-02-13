package Framework.Automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;

public class validateNavBar extends Base{
	 WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	@Test
	public void basePageNavigation() throws IOException
	{
	
		LandingPage lp= new LandingPage(driver);
		Assert.assertTrue(lp.getNav().isDisplayed());
		
		
		
		
	}
	

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
