package com.projectName.companyName.PageObjects;

import com.projectName.companyName.utilities.DriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;





public class NareshItHomePage extends BasePage {

	@FindBy(xpath = "//*[contains(text(),'Buy it now')]")
	WebElement buyItNow;

//	
	
	@FindBy(xpath = "//*[contains(text(),'Click here')]")
	WebElement clickHere;
	@FindBy(xpath = "//a[contains(.,'Upcoming Events')]")
	WebElement UpcomingEvents;

	@FindBy(xpath = "//span[contains(.,'Events')]")
	WebElement Events;

	@FindBy(xpath = "//*[@id='navbar']//*[contains(text(),'Home')]")
	WebElement home;

	@FindBy(xpath = "//*[@id='header']")
	WebElement pageheader;

	@FindBy(xpath = "//*[@id='header']")
	WebElement header;
	@FindBy(xpath = "//*[@class='bx-viewport']")
	WebElement ad;	
	
	
	@Override
	protected  void getPageScreenSot() {
	
		
		
		
		
	}
	

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		
		return ExpectedConditions.visibilityOf(buyItNow);
	}

	
	public NareshItHomePage open(String url) {

		DriverManager.getDriver().navigate().to(url);
		
		return (NareshItHomePage) openPage(NareshItHomePage.class);
	}
	

public void getCred(String getDefaultUserName,String getDefaultPassword) {
	
	System.out.println(getDefaultUserName);
	System.out.println(getDefaultPassword);
	
//	buyItNow.click();
	
	
	
}

	
	public checkOutPage bookItNow(String getDefaultUserName,String getDefaultPassword) {
		
		System.out.println(getDefaultUserName);
		System.out.println(getDefaultPassword);
		
//		buyItNow.click();
		
		
		return (checkOutPage) openPage(checkOutPage.class);
	}
	
}
	
//	public LoginPage clickOnLOGINBtn() throws Exception {
//
//		waitForElementToPresent(LOGINBtn);
//		Thread.sleep(1000);
//		click(LOGINBtn, "LOGIN");
//		return (LoginPage) openPage(LoginPage.class);
//		// new LoginPage(driver, );
//
//	}
//
//	
//
//
//
//	public void verifyAdImage(String expectedImgFileName) throws Exception {
//
//		Thread.sleep(5000);
//		scrollToElement(clickHere);
//		takeScreenshotByShutterBug(ad, "Home Page Ad");
//		
//
//	}
//
//	// public ZohoCRMPage gotoCRM() {
//	//
//	// click(crm,"CRM Link");
//	// return () openPage(.class);
//	// }
//	//
//	// return (ZohoCRMPage) openPage(ZohoCRMPage.class);
//
//}
