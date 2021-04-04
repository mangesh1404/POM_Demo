package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	
	WebDriver driver;
	
	@FindBy(linkText="LOGOUT")
	private WebElement logoutBtn;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement userBtn;
	
	
	public DashboardPage(WebDriver driver) {	
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	
	public UserPage clickUserBtn() {
		userBtn.click();
		return new UserPage(driver);
	}
	
	public void clickLogout() {
		logoutBtn.click();
	}
}
