package com.actitime.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generics.BaseClass;
@Listeners(com.actitime.generics.NewListner.class)

public class AssertUsing extends BaseClass{
	

	@Test
	public void testAssert() {
		SoftAssert s = new SoftAssert();
		
		String ExpectedTitle = "Google123";
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		s.assertEquals(actualTitle, ExpectedTitle);
		s.assertAll();
	}
	
	
	@Test
	public void testLogin() throws IOException {
    driver.get(f.getPropertyFileData("url"));
		
		driver.findElement(By.id("username")).sendKeys(f.getPropertyFileData("un"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyFileData("pw"));
		driver.findElement(By.id("loginButton")).click();
		
	}
}
