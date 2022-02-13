package Framework.Automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;

public class ValidateHeading extends Base {
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
		Assert.assertEquals(lp.getHeading().getText(), "Get back to growth with the world’s #1 CRM, powered by Customer 360");
		
		
		
		
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
