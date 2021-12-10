package com.testCases;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_Home_Page;

public class CA_TC003SearchBoxPositive extends BaseClass{
	SoftAssert sa = new SoftAssert();
	@Test
	
	public void search001() throws IOException
	{
		//Calling login test class 
	CA_TC002Home_Test ht = new CA_TC002Home_Test();
	//performing action 
	ht.TestCase001();
	
	//Calling page object class
	CA_Home_Page HP = new CA_Home_Page(driver);		
	
	//Enter text
		HP.EnterText();
	logger.info("Enter text in Search text box ");
	
	//Selecting Software Developer from suggestion box
	HP.Selectoptin();
	logger.info("Software Developer ");
	
	if (driver.findElement(By.cssSelector("#ui-id-1")).isSelected()) {
		sa.assertTrue (true);
		logger.info("Software Developer is Selected");
	} else {
		sa.assertTrue(false);
		logger.info("Software Developer is not Selected ");
	}

	

}
}