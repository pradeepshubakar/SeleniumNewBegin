package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

@Listeners(com.actitime.generics.NewListner.class)
public class actiTime extends BaseClass{

	
	@Test
	public void testactiTime() throws IOException {
		
		driver.get(f.getPropertyFileData("url"));
		LoginPage l = new LoginPage(driver);
		l.setLogin(f.getPropertyFileData("un"), f.getPropertyFileData("pw"));
		HomePage h = new HomePage(driver);
		h.checkLogo();
	}
}
