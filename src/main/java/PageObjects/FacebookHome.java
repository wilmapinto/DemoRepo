package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookHome {
	
	
	public WebDriver driver;
	
	public FacebookHome(WebDriver driver)
	{
		this.driver= driver;
		
	}
	
	By EmailTxtBox = By.id("email");	
	By EmailText = By.xpath("//input[@id='email']/preceding::label[contains(text(),'Email')]");
	By Password= By.cssSelector("input[name=pass]");
	By PasswordText= By.xpath("//input[@id='pass']/preceding::label[contains(text(),'Password')]");
	
	
	
	
	public WebElement EmailText()
	{
		return driver.findElement(EmailText);
	}
	
	public WebElement EmailTxtBox()
	{
		return driver.findElement(EmailTxtBox);
	}

	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement PasswordText()
	{
		return driver.findElement(PasswordText);
	}
	
}
