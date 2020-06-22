package java.com.projectName.companyName.PageObjects;

import java.com.projectName.companyName.utilities.DriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;





public class HomePage extends BasePage {

	@FindBy(xpath = "//a[contains(.,'Login')]")
	WebElement LOGINBtn;

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
	
		setAttribute(pageheader, "class", "");
		
		aShot();
		setAttribute(pageheader, "class", "navbar-fixed-top");
		
	}
	

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		
		return ExpectedConditions.visibilityOf(LOGINBtn);
	}

	public HomePage NavigateToHome() {
		click(home, "Home");
		return (HomePage) openPage(HomePage.class);
		// new GlobalCareers(driver, );
	}

	public HomePage open(String url) {

		DriverManager.getDriver().navigate().to(url);
		System.out.println("Page Opened");
		return (HomePage) openPage(HomePage.class);
	}

	public LoginPage clickOnLOGINBtn() throws Exception {

		waitForElementToPresent(LOGINBtn);
		Thread.sleep(1000);
		click(LOGINBtn, "LOGIN");
		return (LoginPage) openPage(LoginPage.class);
		// new LoginPage(driver, );

	}

	



	public void verifyAdImage(String expectedImgFileName) throws Exception {

		Thread.sleep(5000);
		scrollToElement(clickHere);
		takeScreenshotByShutterBug(ad, "Home Page Ad");
		

	}

	// public ZohoCRMPage gotoCRM() {
	//
	// click(crm,"CRM Link");
	// return () openPage(.class);
	// }
	//
	// return (ZohoCRMPage) openPage(ZohoCRMPage.class);

}
