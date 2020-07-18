package com.projectName.companyName.PageObjects;

import com.projectName.companyName.utilities.DriverManager;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage extends BasePage {

	@FindBy(xpath = "//*[@id='month']")
	WebElement month_dropdown;

	@FindBy(xpath = "//*[@name='firstname']")
	WebElement firstname;

	@Override
	protected void getPageScreenSot() {

	}

	@Override
	protected ExpectedCondition getPageLoadCondition() {

		return ExpectedConditions.visibilityOf(month_dropdown);
	}

	public FacebookPage open(String url) throws Exception {

		DriverManager.getDriver().navigate().to(url);

		return (FacebookPage) openPage(FacebookPage.class);
	}

	public void getCred(String getDefaultUserName, String getDefaultPassword) {

		System.out.println(getDefaultUserName);
		System.out.println(getDefaultPassword);
		selectUsingVisibleText(month_dropdown, "Aug", "month_dropdown");
		click(firstname, "firstname");
		robot.keyPress(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_B);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// buyItNow.click();

	}

	public checkOutPage bookItNow(String getDefaultUserName, String getDefaultPassword) {

		System.out.println(getDefaultUserName);
		System.out.println(getDefaultPassword);

		// buyItNow.click();

		return (checkOutPage) openPage(checkOutPage.class);
	}

}

// public LoginPage clickOnLOGINBtn() throws Exception {
//
// waitForElementToPresent(LOGINBtn);
// Thread.sleep(1000);
// click(LOGINBtn, "LOGIN");
// return (LoginPage) openPage(LoginPage.class);
// // new LoginPage(driver, );
//
// }
//
//
//
//
//
// public void verifyAdImage(String expectedImgFileName) throws Exception {
//
// Thread.sleep(5000);
// scrollToElement(clickHere);
// takeScreenshotByShutterBug(ad, "Home Page Ad");
//
//
// }
//
// // public ZohoCRMPage gotoCRM() {
// //
// // click(crm,"CRM Link");
// // return () openPage(.class);
// // }
// //
// // return (ZohoCRMPage) openPage(ZohoCRMPage.class);
//
// }
