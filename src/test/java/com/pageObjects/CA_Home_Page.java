package com.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class CA_Home_Page {
	   //WebDriver object
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	// Constructor
	public CA_Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	// Capture job button
	@FindBy(css = "a.nav-link.job-tab ")
	@CacheLookup
	WebElement jobbutton;
	// Capture home_Icon
	@FindBy(css = "a.nav-link.home-tab")
	@CacheLookup
	WebElement home_Icon;
	// Capture Search box 
	@FindBy(id = "typeahead1")
	@CacheLookup
	WebElement SearchboxPositive;
	
	// Capture DDB box 
	@FindBy(css = "#ui-id-1")
	@CacheLookup
	WebElement DDBoption;
	
	// Capture Search box 
	@FindBy(id = "typeahead1")
	@CacheLookup
	WebElement Negative;

	// ==================Action methods===========================//

	// Click on update profile

	public void JobButton() {
		jobbutton.click();
	}

	// Home button is Enable
	public void Homeicon() {
		home_Icon.click();
	}
	// Search box (Positive)

	public void EnterText() {
		SearchboxPositive.sendKeys("Software Developer");
	}
	//Select option from DDB
	public void Selectoptin() {
		DDBoption.click();
	}
	// Search box (Negative)
	public void NegativeSearchbox(Keys ENTER) {
		Negative.sendKeys("!@#$%^&*()");
	}
}

