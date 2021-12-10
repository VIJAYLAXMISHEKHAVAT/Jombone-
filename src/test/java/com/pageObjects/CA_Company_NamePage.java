package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CA_Company_NamePage {
   //WebDriver object
	public WebDriver driver;
	// Constructor
	public CA_Company_NamePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Capture Company Name
	@FindBy(css = "a.nav-link.company-tab")
	@CacheLookup
	WebElement compamyname;
	
	// ==================Action methods===========================//	
	
	// Click on Company Name
	public void verify() {
		compamyname.click();
	}
	
	
	
	
}
