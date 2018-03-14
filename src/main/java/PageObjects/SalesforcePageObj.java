package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesforcePageObj {
	
	public WebDriver driver;
	
	public SalesforcePageObj(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By Links = By.tagName("a");
	
	public List<WebElement> Links()
	{
		return driver.findElements(Links);
	}
	
	By allEditBoxes = By.tagName("a");
	public List<WebElement> allEditBoxes()
	{
		return driver.findElements(allEditBoxes);
	}
	
	By username = By.name("username");
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	By RemembermeCheckbox = By.cssSelector("[name=rememberUn]");
	public WebElement RemembermeCheckbox()
	{
		return driver.findElement(RemembermeCheckbox);
	}
	
	
	By LoginButton = By.cssSelector("[name=Login]");
	public WebElement LoginButton()
	{
		return driver.findElement(LoginButton);
	}
	
	By Password = By.cssSelector("form[name='login']>input[id='password']");

	public WebElement Password()
	{
		return driver.findElement(Password);
	}
}
