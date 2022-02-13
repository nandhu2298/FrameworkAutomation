package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By signin= By.partialLinkText("Login");
	By heading = By.xpath("//*[@id=\"get-back-to-growth-with-the-worlds-1-crm-powered-by-customer-360\"]/span");
	By nav1 =  By.xpath("//span[contains(text(),'Products')]");
	public LandingPage(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement getLogin()
	{
		
		return driver.findElement(signin);
	}
	public WebElement getHeading()
	{
		
		return driver.findElement(heading);
	}
	public WebElement getNav()
	{
		return driver.findElement(nav1);
	}
	
}
