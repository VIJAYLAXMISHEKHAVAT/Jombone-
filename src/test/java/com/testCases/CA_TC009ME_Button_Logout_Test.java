package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.base.BaseClass;
import com.pageObjects.CA_Logout_Page;

public class CA_TC009ME_Button_Logout_Test extends BaseClass {	
	SoftAssert softassert = new SoftAssert();
	@Test
	public void TestCase003() throws IOException 
	{
		//Calling login test class 
		CA_TC005Me_Button mbt = new CA_TC005Me_Button();
	
		//performing action 
		mbt.TestCase005();
		
		//Calling page object class
		CA_Logout_Page lg = new CA_Logout_Page(driver);		
	
		//performing action 
		lg.LogoutButton();			
		logger.info("Clicked on Logout button");
		
		//performing action 
		lg.Yes_Button();
		logger.info("Clicked on Logout yes button");
		
		
		//validating user Logout
		if(driver.getTitle().equals("Login"))
		{
			softassert.assertTrue(true);
			logger.info("Test Passed! Logout Successful!");
		}
		else
		{
			softassert.assertTrue(false);
			logger.error("Test Failed! Logout failed!");
			captureScreen(driver,"Logouttest");
		}
		softassert.assertAll();
		logger.info("Completed Logout test");
	}

}
