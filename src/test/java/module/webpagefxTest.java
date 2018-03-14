package module;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.webpagefxPageObjects;
import resources.base;

public class webpagefxTest extends base {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	webpagefxPageObjects wb;
	
	@BeforeClass
	public void init() throws Throwable
	{
		driver=initializeDriver();
		this.wb= new webpagefxPageObjects(driver);
		
	}
	
	@Test
	public void dropdowncheck()
	{
		driver.get(prop.getProperty("url3"));
		wb.username().sendKeys("wilma");
		wb.company().sendKeys("company1");
		wb.email().sendKeys("welma.com");
		wb.phone().sendKeys("408");
		Select select= new Select(wb.dropbox());
		System.out.println(select.getFirstSelectedOption().getText());
		
		List<WebElement> allopts=select.getOptions();
		for(int i=0; i<allopts.size(); i++ )
		{
			System.out.println(allopts.get(i).getText());
			
		}
		

		
	}
	
	
	
	

}
