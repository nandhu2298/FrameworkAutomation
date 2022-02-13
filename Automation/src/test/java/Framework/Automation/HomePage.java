package Framework.Automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;


public class HomePage extends Base{
	 WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		
		driver.manage().window().maximize();
		
	}
	
    @Test(dataProvider= "getData")
	public void basePageNavigation(String username, String pass) throws IOException
	{
    	driver.get(prop.getProperty("url"));
		LandingPage lp= new LandingPage(driver);
		lp.getLogin().click();
		
		
		LoginPage lo= new LoginPage(driver);
		lo.getUsername().sendKeys(username);
		lo.getPassword().sendKeys(pass);
		//System.out.println(user);
		lo.getLogin().click();
		
		
		
		
	}
	//data driven , parameterization
	@DataProvider
	public Object[][] getData()
	{
		Object[][]  data=new Object[2][2];
		data[0][0]="user1";
		data[0][1]="pass123";
		//data[0][2]="restricted";
			
		data[1][0]="user2";
		data[1][1]="pass123";
//		data[1][2]="non restricted";
				//rows-how many diff data
				
		return data;
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

	
}


