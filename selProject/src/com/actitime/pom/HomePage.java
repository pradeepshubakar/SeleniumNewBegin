package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class HomePage {

	@FindBy(id="logo_aT")
	private WebElement  actiTimeLogo;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void checkLogo() {
		//actiTimeLogo.isDisplayed();
	SoftAssert s = new SoftAssert();
	s.assertTrue(actiTimeLogo.isDisplayed());
	
	}
}
