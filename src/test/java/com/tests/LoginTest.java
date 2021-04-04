package com.tests;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginTest {

	WebDriver driver;
	LoginPage lp=null;
	DashboardPage dp=null;
	
	@BeforeSuite
	public void setUp() {
		driver= TestBase.initialization();
	    lp= new LoginPage(driver);
		
	}
	
	@Test(priority=1)
	public void loginTestCase() {
		
		dp=lp.validLogin();
		dp.clickLogout();
	}
	
	@Test(priority=2)
	public void registerTest() {
		lp.clickRegisterLink();
	}
	@Test(priority=3)
	public void userpageTest() {
		dp.clickUserBtn();
	}
	
}
