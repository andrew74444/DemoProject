package com.projectName.companyName.testcases;


import com.projectName.companyName.PageObjects.*;
import com.projectName.companyName.utilities.*;
import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;






public class ActiveMembersLoginTest2 extends BaseTest {

	
	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="masterDP")
	public void loginTest(Hashtable<String,String> data) throws Exception {
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		DataUtil.checkExecution("master", "LoginTest", data.get("Runmode"), excel);
		log.info("Inside Login Test");		
		openBrowser(data.get("browser"));

		HomePage home = new HomePage().open(getTestSiteURL());
		
		home.getCred(getDefaultUserName(),getDefaultPassword());
		
		

		//Assert.fail("Failing the login test");
	}

	@AfterMethod
	public void tearDown() {
		
//		logInfo("Login Test Completed");
		
		quit();
		
	}

}
