package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test(groups="smokeTest")
	
	public void testDemo() {
		Reporter.log("My Darling Advika",true);
		System.out.println("Hi Dear");
	}
}

