package com.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_MyProfilePage;

public class CA_TC005Me_Button extends BaseClass{
	SoftAssert sa = new SoftAssert();
	@Test
	public void TestCase005() throws IOException {
		
		//Calling login test class 
		CA_TC002Home_Test tc2= new CA_TC002Home_Test();
		
		//performing action 
		tc2.TestCase001();		
		
		//Calling page object class
		CA_MyProfilePage mb =  new CA_MyProfilePage(driver);
		
		//Mouse hover on me
		mb.MeButton();
		logger.info("Mouse hover on me button");  
		

		if (driver.findElement(By.xpath("//a[@id='navbardrop']")).isDisplayed()) {
			sa.assertTrue (true);
			logger.info("Mouse hover Link Displayed");
		} else {
			sa.assertTrue(false);
			logger.info(" Mouse hover Link not Displayed");
		}
	}
	

}
