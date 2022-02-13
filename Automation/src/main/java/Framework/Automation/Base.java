package Framework.Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	 WebDriver driver;
	 Properties prop = new Properties();
	public WebDriver initializeDriver() throws IOException
	{
		
		FileInputStream fis= new FileInputStream("D:\\selenium\\Automation\\src\\main\\java\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName=="firefox"){
			
			driver= new FirefoxDriver();
			
		}
		
else if(browserName=="edge"){
			
			driver= new EdgeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	public void getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//String destination= System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		
		String destination= System.getProperty("user.dir")+"/Screenshots/test.jpg";


		FileUtils.copyFile(source, new File(destination));
		
	
}}
