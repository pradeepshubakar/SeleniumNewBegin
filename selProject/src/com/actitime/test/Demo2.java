package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.actitime.pom.LoginPage;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		LoginPage l = new LoginPage(driver);
		PageFactory.initElements(driver, l);
		l.setLogin("admin", "manager");
		
	}
}
