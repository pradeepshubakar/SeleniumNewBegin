package com.actitime.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {

	
	@Test(priority = 2, dependsOnMethods="registerCustomer")
	public void createCustomer() {
		Reporter.log("Customer created",true);
	}
	
	@Test(priority=4,dependsOnMethods="editCustomer")
	public void deleteCustomer() {
		Reporter.log("Customer deleted",true);
	}
	
	@Test(priority=3,dependsOnMethods="createCustomer")
	public void editCustomer() {
		Reporter.log("Customer edited",true);
	}
	
	@Test(priority = 1)
	public void registerCustomer() {
		//Assert.fail();                                                     
		Reporter.log("Customer registered",true);
	}
}
