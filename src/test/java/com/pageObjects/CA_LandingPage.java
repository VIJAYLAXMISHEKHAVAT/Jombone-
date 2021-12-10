package com.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.BaseClass;

public class CA_LandingPage extends BaseClass {
	   //WebDriver object
	public WebDriver driver;
	// Constructor
	public CA_LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// Capture profile update close 
	@FindBy(css = "span.close-icon.svg-big-size.d-block")
	@CacheLookup
	WebElement profileupdate;
	
	// Capture Login
	@FindBy(xpath="//a[contains(text(),'Log In')]")
	@CacheLookup
	WebElement signup;

	// ==================Action methods===========================// 
	
	// Click profile update close 
	public void clickonX() {
		profileupdate.click(); 
}
	// Click on signup  button
	public void clicklogin() {
		signup.click();
	}
	
}
