package com.projectName.companyName.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
	
	
	
	@Override
	protected ExpectedCondition getPageLoadCondition() {	
	 
		return ExpectedConditions.visibilityOf(LoginBtn);
	}

	@Override
	protected  void getPageScreenSot() {
		

		aShot();

	}
	@FindBy(xpath = "//*[@id='header']")
	WebElement pageheader;
	
	@FindBy(xpath = "//*[@name='Email']")
	WebElement emailAddress;

	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;

	@FindBy(xpath = "//button[contains(.,'Login')]")
	WebElement LoginBtn;

	@FindBy(xpath = "//li[contains(text(),'Invalid login credentials. Please try again')]")
	WebElement Invalidlogin;

	
	@FindBy(xpath = "//div[@class='col-xs-12 text-right']//button[@type='submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement toastMessage;

	@FindBy(xpath = "//a[@class='forgot-password']")
	WebElement forgotPassword;

	
	public void login(String enterEmailAddress, String password) {
		type(this.emailAddress, enterEmailAddress, "email address");
		type(this.password, password, "password");
		click(LoginBtn, "Login");
	}

	
	public LoginPage emailVerificationPending(String enterEmailAddress, String password) {
		login(enterEmailAddress, password);		
		return this;
	}
	
	
	
	public LoginPage waitingForApproval(String enterEmailAddress, String password) {
		login(enterEmailAddress, password);	
		
//		Your organization license is pending for approval. Please contact administrator.
		
		return this;
	}
	
	
	
	


	public LoginPage InvalidloginToApplication(String EmailAddress, String password) {

		this.login(EmailAddress, password);
		waitForElementToPresent(Invalidlogin);
		Invalidlogin.isDisplayed();		
		return this;
	}
	
	public LoginPage validloginToApplication(String EmailAddress, String password) {

		this.login(EmailAddress, password);
		return this;
	}


	
	

	public void accountLocked(String EmailAddress, String password) throws Exception {
		
		this.login(EmailAddress, password);
		waitForElementToPresent(Invalidlogin);
		
		Thread.sleep(3000);
		emailAddress.clear();
		this.password.clear();
		this.login(EmailAddress, password);
		waitForElementToPresent(Invalidlogin);
		
		Thread.sleep(3000);
		emailAddress.clear();
		this.password.clear();
		this.login(EmailAddress, password);		
	}

	
}


	
//	public boolean verifySuccessLoginMsg() {
//		return new VerificationHelper(driver).isDisplayed(usertext);
//	}

//	public boolean verifyInvalidlogin() {
//		return new VerificationHelper(driver).isDisplayed(Invalidlogin);
//	}
//
//	public boolean LoginPagedisplayed() {
//		return new VerificationHelper(driver).isDisplayed(LoginBtn);
//	}
//	


	
	
	
	
	

	
//	public ZohoCRMPage gotoCRM() {
//		
//		click(crm,"CRM Link");
//		return () openPage(.class);
//	}
//	
//	return (ZohoCRMPage) openPage(ZohoCRMPage.class);
	
	

