package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	
	public static WebDriver initialization() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
}
