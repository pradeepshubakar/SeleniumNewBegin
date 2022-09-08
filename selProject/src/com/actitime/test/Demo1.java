package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	@Test(groups="RegressionTest")
	
	public void testDemo1() {
		
		Reporter.log("TestNG report testing......",true);
	}
}
