package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CA_JobTitlePage {
	// WebDriver object
	public WebDriver driver;

	// Constructor
	public CA_JobTitlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Capture job icon
	@FindBy(css = "a.nav-link.job-tab")
	@CacheLookup
	WebElement job;
	
	// Capture posted job
	@FindBy(xpath = "//a[@href=\"/candidate/job/shift/olTW7UpGk__PLS__w=/details\"]")
	@CacheLookup
	WebElement postedjob;

	// ==================Action methods===========================//
	// Click on job icon
	public void ClickOnJob() {
		job.click();
	}

	// Click on posted job
	public void PostedJob() {
		postedjob.click();

	}
}
