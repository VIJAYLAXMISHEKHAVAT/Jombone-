package com.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.base.BaseClass;
import com.pageObjects.CA_Home_Page;

public class CA_TC002Home_Test extends BaseClass {
	SoftAssert softassert = new SoftAssert();

	@Test
	public void TestCase001() throws IOException {
		// Calling login test class
		CA_TC001LoginTest LT = new CA_TC001LoginTest();
		// performing action
		LT.Logintest();

		// Calling page object class
		CA_Home_Page HP = new CA_Home_Page(driver);

		// Click on search job
		HP.JobButton();
		logger.info("Clicked on search job ");

		// Click on Home button
		HP.Homeicon();
		logger.info("Clicked on Home button  ");

		if (driver.getTitle().equals("Dashboard")) {
			softassert.assertTrue(true);
			logger.info("Test Passed!  User is on Dashboard!");
		} else {
			softassert.assertTrue(false);
			logger.error("Test Failed! Login failed!");
			captureScreen(driver, "Logintest");
		}
		softassert.assertAll();
		logger.info("Completed Logintest");

	}
}