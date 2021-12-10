package com.testCases;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.base.BaseClass;
import com.pageObjects.CA_JobTitlePage;

public class CA_TC13JobLoctionTest extends BaseClass {
	SoftAssert sa = new SoftAssert();
	@Test
	public void TC0013() throws IOException {
		
		//Calling login test class 
		CA_TC001LoginTest lt = new CA_TC001LoginTest();
		
		//performing action 
		lt.Logintest();
		
		//Calling login page object class 
		CA_JobTitlePage jtp = new CA_JobTitlePage(driver); 
		//performing action 
		jtp.ClickOnJob();
		logger.info(" Clicked on job title ");
		
		//validating Location visible
		if (driver.findElement(By.xpath("//body[1]/section[1]/section[1]/div[2]/div[1]/div"
				+ "[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]")).isDisplayed()) {
			
			sa.assertTrue(true);
			logger.info("Job Location visible");
		}
		else {
			sa.assertTrue(false);
			logger.info("Job Location not visible");
		}
	}
	
	
	
	
	
}
