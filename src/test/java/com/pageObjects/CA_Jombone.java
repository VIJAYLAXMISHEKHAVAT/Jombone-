package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CA_Jombone {
	// WebDriver object
	public WebDriver driver;

	// Constructor
	public CA_Jombone(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Capture profile update close
	@FindBy(xpath = "//body/section[1]/div[3]/div[1]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement clickprofileupdate;
	// Capture jombone text
	@FindBy(css = "a.navbar-brand")
	@CacheLookup
	WebElement jombone;

	// ==================Action methods===========================//

	// Click profile update close
	public void clickonX() {
		clickprofileupdate.click();
	}

	// Click jombone text
	public void ClickJombone() {
		jombone.click();
	}
}
