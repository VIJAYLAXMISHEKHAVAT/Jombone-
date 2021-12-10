package com.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_JobTitlePage;

public class CA_TC0011JobTitleTest extends BaseClass {
	SoftAssert sa = new SoftAssert();

	@Test
	public void TC004() throws IOException {

		// Calling login test class
		CA_TC001LoginTest lt = new CA_TC001LoginTest();
		lt.Logintest();

		// Calling page object class
		CA_JobTitlePage jtp = new CA_JobTitlePage(driver);

		// Click on job title
		jtp.ClickOnJob();
		logger.info(" Clicked on job title ");

		// Validating job title is Visible

		if (driver.findElement(By.cssSelector("a.nav-link.job-tab.active")).isDisplayed()) {
			sa.assertTrue(true);
			logger.info("Job title is Visible");
		} else {
			sa.assertTrue(false);
			logger.error("Job title is InVisible");
		}
		// Click on Posted job
		jtp.PostedJob();
		logger.info(" Clicked on Posted job ");

	}

}
