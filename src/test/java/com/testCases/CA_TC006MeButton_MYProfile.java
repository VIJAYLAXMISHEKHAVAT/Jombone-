package com.testCases;
import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.base.BaseClass;
import com.pageObjects.CA_MyProfilePage;

public class CA_TC006MeButton_MYProfile extends BaseClass {
	SoftAssert sa = new SoftAssert();
	@Test
	public void TestCase002() throws IOException {
		//Calling login test class
		CA_TC005Me_Button tc5 = new CA_TC005Me_Button();
		
		//performing action 
		tc5.TestCase005();
		
		//Calling page object class
		CA_MyProfilePage mb =  new CA_MyProfilePage(driver);	
		
		//Clicked on My Profile
		mb.MyProfile();
		logger.info("Clicked on My Profile ");
		
		if (driver.getTitle().equals("Candidate Profile")) {
			sa.assertTrue (true);
			logger.info("User is on Candidate Profile");
		} else {
			sa.assertTrue(false);
			logger.info("User is not on Candidate Profile ");
		}
}
}