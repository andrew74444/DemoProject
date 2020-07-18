package com.projectName.companyName.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkOutPage extends BasePage{
	
	
	
	@Override
	protected ExpectedCondition getPageLoadCondition() {	
	 
		return ExpectedConditions.visibilityOf(address);
	}

	@Override
	protected  void getPageScreenSot() {
		

		

	}
	@FindBy(xpath = "//input[@placeholder='Last name']")
	WebElement lastName;
	
	@FindBy(xpath = "//*[@name='Email']")
	WebElement emailAddress;

	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement city;

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//input[@placeholder='ZIP code']")
	WebElement PINcode;

	
	@FindBy(xpath = "//*[@placeholder='State']")
	WebElement State;

	@FindBy(xpath = "(//*[@class='field__input field__input--select'])[1]")
	WebElement country;

	@FindBy(xpath = "//span[contains(text(),'Continue to shipping')]")
	WebElement continueShipping;
	
	
	@FindBy(xpath = "//span[contains(text(),'Continue to payment')]")
	WebElement continuePayment;
	
	@FindBy(xpath = "(//*[@class='input-radio'])[2]")
	WebElement cashOnDelevery;
	
	@FindBy(xpath = "//span[contains(text(),'Complete order')]")
	WebElement completeOrder;
	
	
	@FindBy(xpath = "//h2[contains(text(),'Thank you')]")
	WebElement thankYou;
	
	@FindBy(xpath = "//*[@class='radio__label']")
	WebElement shippingRadioButton;
	
	
	
	//li[contains(text(),'')]
	
	@FindBy(xpath = "//*[@placeholder='Address']")
	WebElement address;
	
//	
	
//	
	
	public void purchase(String getDefaultUserName,String getDefaultPassword) throws Exception {

		System.out.println(getDefaultUserName);
		System.out.println(getDefaultPassword);
		
//	email.sendKeys(getDefaultUserName);
//	lastName.sendKeys("Thomson");
//	address.sendKeys("5 Independence Way");
//	city.sendKeys("Princeton");
//	selectUsingValue(country, "United States");
//	
//	Thread.sleep(1000);
//	selectUsingValue(State, "NJ");
//	PINcode.sendKeys("08540");
//	scrollToElement(continueShipping);
//	
//	clickElementByJavaScript(continueShipping);
//	
//	
//	
//	WebDriverWait wait1 = new WebDriverWait(driver, 30);
//	wait1.until(ExpectedConditions.visibilityOf(shippingRadioButton));
//	
////	waitForElementToPresent(shippingRadioButton);
//	
//	scrollToElement(continuePayment);
//	clickElementByJavaScript(continuePayment);
//	
//	wait1.until(ExpectedConditions.visibilityOf(cashOnDelevery));
//	
//	clickElementByJavaScript(cashOnDelevery);
//	
//	
//	Thread.sleep(2000);
//	clickElementByJavaScript(completeOrder);
//	wait1.until(ExpectedConditions.visibilityOf(thankYou));
	
	
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
	
	

