package com.actitime.generics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class NewListner extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		 Calendar calendar = Calendar.getInstance();
		    SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");

		    String methodName = result.getName();

		    if (!result.isSuccess()) {

		        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		        String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
		                + "./UiScreenShot";

		        File destFile = new File((String) reportDirectory + "/failure_screenshots/" + methodName + "_"
		                + formater.format(calendar.getTime()) + ".png");

		        try {
		            FileUtils.copyFile(scrFile, destFile);
		        } catch (IOException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }

		        Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
		                + "' height='100' width='100'/> </a>");

	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
