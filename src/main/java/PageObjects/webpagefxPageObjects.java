package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webpagefxPageObjects {
	
	public WebDriver driver;
	
	public webpagefxPageObjects(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[id='name']")
	WebElement username;
	
	public WebElement username()
	{
		return username;
	}
	
	@FindBy(css="input[id='company']")
	WebElement company;

	public WebElement company()
	{
		return company;
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	public WebElement email()
	{
		return email;
	}
	
	@FindBy(id="phone")
	WebElement phone;
	
	public WebElement phone()
	{
	    return phone;	
	}
	
	@FindBy(xpath="//select[@id='budget']")
	WebElement dropbox;
	
	public WebElement dropbox()
	{
		return dropbox;
	}
	
}
