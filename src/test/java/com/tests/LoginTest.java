package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		dp= new DashboardPage(driver);
	}
	
	@Test(priority=1)
	public void loginTestCase() {
		
		/*lp.enterUsername("kiran@gmail.com");
		lp.enterPassword("123456");
		lp.clickLoginButton();*/
		lp.validLogin();
		dp.clickLogout();
	}
	
	@Test(priority=2)
	public void registerTest() {
		lp.clickRegisterLink();
	}
	
	
}
