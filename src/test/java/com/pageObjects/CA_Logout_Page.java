package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CA_Logout_Page {
	public WebDriver driver;
		public CA_Logout_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		// Capture  logout button
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[6]/div[1]/a[8]")
	@CacheLookup
	WebElement logout;
	// Capture  logout yes button
	@FindBy(xpath = " //body/div[@id='signOut']/div[1]/div[1]/div[2]/div[2]/a[1]")
	@CacheLookup
	WebElement yesbutton;

// ==================Action methods===========================//
	//Click on logout button
	public void LogoutButton() {
		logout.click();
	}
	//Click logout yes button
	public void Yes_Button() {
		yesbutton.click();
	}
}
