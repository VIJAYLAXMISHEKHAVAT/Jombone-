package com.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_JobTitlePage;

public class CA_TC0012CompanyNameTest extends BaseClass {
	SoftAssert sa = new SoftAssert();

	@Test
	public void TC0012() throws IOException {

		// Calling login test class
		CA_TC001LoginTest lt = new CA_TC001LoginTest();
		lt.Logintest();
		// Calling page object class
		CA_JobTitlePage jtp = new CA_JobTitlePage(driver);
		// Click on job title
		jtp.ClickOnJob();
		logger.info(" Clicked on job title ");

		// Validating Company Name is Visible
		if (driver.findElement(By.cssSelector("a.nav-link.company-tab")).isDisplayed()) {
			sa.assertTrue(true);
			logger.info("Company Name Visiable");
		} else {
			sa.assertTrue(false);
			logger.info("Company Name Not Visiable ");
		}

	}

}
