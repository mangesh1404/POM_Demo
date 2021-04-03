package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	
	WebDriver dpdriver;
	
	public DashboardPage(WebDriver driver) {
		dpdriver=driver;
	}
	private WebElement getLogoutButton() {
		return dpdriver.findElement(By.linkText("LOGOUT"));
	}
	
	public void clickLogout() {
		getLogoutButton().click();
	}
}
