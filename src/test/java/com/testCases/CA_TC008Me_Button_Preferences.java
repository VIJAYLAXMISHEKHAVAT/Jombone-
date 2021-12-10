package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_MyProfilePage;

public class CA_TC008Me_Button_Preferences extends BaseClass{
	SoftAssert sa = new SoftAssert();
	@Test
	public void TestCase008() throws IOException {  
		
		//Calling login test class 
		CA_TC005Me_Button tc8 = new CA_TC005Me_Button();
		
		//performing action 
		tc8.TestCase005();
		
		//Calling page object class
		CA_MyProfilePage mb =  new CA_MyProfilePage(driver);
		
		//Click on Preferences
		mb.ClickPreferences();
		logger.info("Clicked on Preferences");
		
		if (driver.getTitle().equals("Preferences")) {
			sa.assertTrue (true);
			logger.info("User is on Preferences Page");
		} else {
			sa.assertTrue(false);
			logger.info("User is not on Preferences Page ");
		}
	}
}
