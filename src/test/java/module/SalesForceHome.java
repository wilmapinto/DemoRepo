package module;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.SalesforcePageObj;
import resources.base;

public class SalesForceHome extends base {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	SalesforcePageObj sf;
	
	@BeforeClass
	public void setup() throws Throwable
	{
		driver= initializeDriver();
		this.sf= new SalesforcePageObj(driver);
		driver.get(prop.getProperty("url1"));
	}
	
	@Test
	public void AllLinks()
	{	
		
		for(int i=0; i< sf.Links().size(); i++)
		{
			System.out.println(sf.Links().get(i).getText());
		}
		
	}
	
	@Test(dependsOnMethods={"AllLinks"})
	public void AllEditBoxes()
	{
		System.out.println("The number of edit boxes are ");
		System.out.println(sf.allEditBoxes().size());
	}
	
	@Test
	public void cssEditbox()
	{
		sf.username().sendKeys("hello");
	}
	
	@Test
	public void RemembermeCheckbox()
	{
		if(sf.RemembermeCheckbox().isSelected())
		{
			sf.RemembermeCheckbox().click();
		}
		
	}
	
	@Test(dependsOnMethods={"cssEditbox"})
	public void LoginButtonClick()
	{
		sf.LoginButton().click();
		
		assertTrue(driver.getPageSource().contains("enter your pass"));
		
		
	}
	
	@Test(dependsOnMethods={"LoginButtonClick"})
	public void password()
	{
		sf.Password().sendKeys("pass");
		sf.username().sendKeys("hello");
		sf.LoginButton().click();
		
	}
	
	@AfterClass(enabled=false)
	public void closeUp()
	{
		driver.close();
	}

}
