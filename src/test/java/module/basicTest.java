package module;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resources.base;

public class basicTest extends base {

	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeClass
	public void setup() throws Throwable
	{
		driver=initializeDriver();
	}
	
	@Test
	public void Test1()
	{
		
		driver.get(prop.getProperty("url"));
	}
	
	
}
