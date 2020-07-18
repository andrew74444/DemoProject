package com.projectName.companyName.PageObjects;

import com.projectName.companyName.utilities.DriverManager;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;





public class HomePage2 extends BasePage {

	@FindBy(xpath = "//iframe")
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

	
	public HomePage2 open(String url) {

		DriverManager.getDriver().navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open6");
		
		return (HomePage2) openPage(HomePage2.class);
	}
	

public void getCred(String getDefaultUserName,String getDefaultPassword) {
	
	// It will return the parent window name as a String
	String parent=DriverManager.getDriver().getWindowHandle();
	System.out.println(parent);
	DriverManager.getDriver().findElements(By.xpath("//iframe")).size();
	DriverManager.getDriver().switchTo().frame("iframeResult");
	DriverManager.getDriver().findElement(By.xpath("//*[contains(text(),'Open Windows')]")).click();

	// This will return the number of windows opened by Webdriver and will return Set of St//rings
	Set<String>s1=DriverManager.getDriver().getWindowHandles();

	// Now we will iterate using Iterator
	Iterator<String> I1= s1.iterator();

	while(I1.hasNext())
	{

	   String child_window=I1.next();

	// Here we will compare if parent window is not equal to child window then we            will close

	if(!parent.equals(child_window))
	{
		System.out.println(child_window);
		DriverManager.getDriver().switchTo().window(child_window);

		String title = DriverManager.getDriver().switchTo().window(child_window).getTitle();
	System.out.println(title);
	
	if (title.equalsIgnoreCase("Google"))
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Selenium");
	}

	
	
	DriverManager.getDriver().close();
	}

	}
	// once all pop up closed now switch to parent window
	DriverManager.getDriver().switchTo().window(parent);
	
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
