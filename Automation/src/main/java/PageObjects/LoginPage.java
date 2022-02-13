package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By name= By.id("username");
	By pass= By.id("password");
	By login= By.id("Login");
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
	}


	public WebElement getUsername()
	{
		
		return driver.findElement(name);
	}

	public WebElement getPassword()
	{
		
		return driver.findElement(pass);
	}
	public WebElement getLogin()
	{
		
		return driver.findElement(login);
	}
	
}
