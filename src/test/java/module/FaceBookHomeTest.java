package module;

import static org.testng.Assert.assertTrue;
import junit.framework.Assert;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.FacebookHome;
import resources.base;

public class FaceBookHomeTest extends base{
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	FacebookHome fb;
	
	@BeforeClass
	public void setup() throws Throwable
	{
		driver= initializeDriver();
		this.fb= new FacebookHome(driver);
	}
	
	@Test
	public void page1()
	{
		driver.get(prop.getProperty("url"));
		fb.EmailTxtBox().clear();
		fb.EmailTxtBox().sendKeys("408");
		System.out.println("=========");
	
	    Assert.assertTrue(fb.EmailText().isDisplayed());
	    Assert.assertEquals("Email or Phone", fb.EmailText().getText());
	
		fb.Password().sendKeys("hello");
		try
		{
			assertTrue(fb.PasswordText().getText().matches(".*Pass.*"));
		}
		catch(Exception e)
		{			
			log.info(e);
		}
        
		
	}
	

}
