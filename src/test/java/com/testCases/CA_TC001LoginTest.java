package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.CA_LoginPage;

public class CA_TC001LoginTest extends BaseClass {
	SoftAssert softassert = new SoftAssert();
	@Test
	public void Logintest() throws IOException
	{
		//Started the login test
		logger.info("Started Logintest");
		//Create the object for LandingPage
	CA_LandingPage lp = new CA_LandingPage(driver);
	
		//Clicking on Login button
	   lp.clicklogin();
		logger.info("Clicked on Login");
		//Create an object for LoginPage
		CA_LoginPage lg = new CA_LoginPage(driver);
		
		lg.settxtemail(username1);		//Enter user name
		lg.settxtpassword(password);	//Enter password
		lg.clkbtnSubmit();             //Click on submit button		
		
		//Validate whether login is successful
	
		if(driver.getTitle().equals("Dashboard"))
		{
			softassert.assertTrue(true);
			logger.info("Test Passed! Login Successful!");
		}
		else
		{
			softassert.assertTrue(false);
			logger.error("Test Failed! Login failed!");
			captureScreen(driver,"Logintest");
		}
		softassert.assertAll();
		logger.info("Completed Logintest");
		//click on window update profile
	   lp.clickonX();
	}
		

}
