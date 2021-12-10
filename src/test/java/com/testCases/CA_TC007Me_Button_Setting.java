package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_MyProfilePage;

public class CA_TC007Me_Button_Setting extends BaseClass {
	SoftAssert sa = new SoftAssert();	
	@Test
	public void TestCase002() throws IOException {
		//Calling login test class
		CA_TC006MeButton_MYProfile tc6 =  new  CA_TC006MeButton_MYProfile();
		
		//performing action 
		tc6.TestCase002();
		
		//Calling page object class
		CA_MyProfilePage mb =  new CA_MyProfilePage(driver);
		
		//Clicked on Settings
		mb.Settings();		
		logger.info("Clicked on Settings");
		
		if (driver.getTitle().equals("Settings")) {
			sa.assertTrue (true);
			logger.info("User is on Settings Window");
		} else {
			sa.assertTrue(false);
			logger.info("User is not on Cettings Window ");
		}
}
}