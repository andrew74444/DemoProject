package com.projectName.companyName.testcases;

import com.projectName.companyName.PageObjects.HomePage;
import com.projectName.companyName.utilities.*;
import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;






public class RegisteredMembersLoginTest extends BaseTest {

	
	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="masterDP")
	public void loginTest(Hashtable<String,String> data) throws Exception {

		Thread.sleep((int) (Math.random()*1000));
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		DataUtil.checkExecution("master", "LoginTest", data.get("Runmode"), excel);
		log.info("Inside Login Test");
		
		
		
		openBrowser(data.get("browser"));
//		log.info("Username entered as " +getDefaultUserName()+ " and Password entered as " + getDefaultPassword());	
//		logInfo("Launched Browser : "+data.get("browser"));
//		
//		
//		
//		
		HomePage home = new HomePage().open(getTestSiteURL());

		//Assert.fail("Failing the login test");
	}

	@AfterMethod
	public void tearDown() {
		
		logInfo("Login Test Completed");
		
		quit();
		
	}

}
