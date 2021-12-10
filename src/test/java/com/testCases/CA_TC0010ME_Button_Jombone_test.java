package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;

import com.pageObjects.CA_Jombone;

public class CA_TC0010ME_Button_Jombone_test extends BaseClass {
	SoftAssert softassert = new SoftAssert();
	@Test
	public void TestC004() throws IOException {
		
		//Calling login test class 
		CA_TC002Home_Test ht = new CA_TC002Home_Test();
		//performing action 
		ht.TestCase001();
		
		//Calling page object class
		CA_Jombone jb = new CA_Jombone(driver);
		
	   //Click on Jombone button 
		jb.ClickJombone();
		logger.info("Clicked on Jombone button ");
		
		if (driver.getTitle().equals("Dashboard")) {
			softassert.assertTrue(true);
			logger.info("Test Passed! User is on Dashboard!");
		} else {
			softassert.assertTrue(false);
			logger.error("Test Failed! User is on Dashboard!");
			captureScreen(driver, "Dashboard test");
		}
		softassert.assertAll();
		logger.info("Test Completed User is on dashboard");

	}
	
}
