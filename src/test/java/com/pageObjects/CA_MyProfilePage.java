package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CA_MyProfilePage {
	// WebDriver object
	public WebDriver driver;
	// Constructor
	public CA_MyProfilePage(WebDriver driver) {
        this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
	// Capture Me button
	 @FindBy(id = "navbardrop")
	  @CacheLookup 
	  WebElement mebutton;
	// Capture  my profile
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[6]/div[1]/a[1]")
	@CacheLookup
	WebElement myprofile;
	// Capture settings
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[6]/div[1]/a[6]")
	@CacheLookup
	WebElement settings;
	// Capture preferences
	@FindBy(css = "//body/nav[1]/div[1]/div[1]/ul[1]/li[6]/div[1]/a[2]")
	@CacheLookup
	WebElement prefrences;
	// ==================Action methods===========================//

	// clicking on ME button

		public void MeButton() {			
		new Actions(driver).moveToElement(driver.findElement(By.id("navbardrop"))).build().perform();
			}
	
	// Click on My Profile
	public void MyProfile() {
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[6]"
				+ "/div[1]/a[1]"))).click().build().perform();
	
	}	
	// Clicking on setting button
	public void Settings() {
		new Actions(driver).moveToElement(driver.findElement(By.id("navbardrop"))).build().perform();
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[6]"
				+ "/div[1]/a[6]"))).click().build().perform();
		
	}
	// Clicking on Preferences button
	public void ClickPreferences() {
		new Actions(driver).moveToElement(driver.findElement(By.id("navbardrop"))).build().perform();
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[6]/div[1]/a[2]"))).click().build().perform();
		new Actions(driver).moveToElement(driver.findElement(By.id("navbardrop"))).build().perform();
	}

}