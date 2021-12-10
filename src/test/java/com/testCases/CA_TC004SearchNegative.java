package com.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_Home_Page;

public class CA_TC004SearchNegative extends BaseClass{
	SoftAssert sa = new SoftAssert();
@Test
	public void search001() throws IOException	{
	//Calling login test class 
	CA_TC003SearchBoxPositive tc3 = new CA_TC003SearchBoxPositive();
	
	//performing action 
	tc3.search001();
	
	//Calling page object class
	CA_Home_Page HP = new CA_Home_Page(driver);	
	
	//Enter Negative job
	HP.NegativeSearchbox(Keys.ENTER);
	logger.info("Negative Search box");
	
	if (driver.findElement(By.id("typeahead1")).isEnabled()) {
		sa.assertTrue (true);
		logger.info("Entered Negative text Displayed");
	} else {
		sa.assertTrue(false);
		logger.info(" Entered Negative text not Displayed");
	}

}
}