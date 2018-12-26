package com.actitimetemp.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImp implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
    @Override
	public void onTestFailure(ITestResult result) {
		String TestName = result.getMethod().getMethodName();
		EventFiringWebDriver Edriver = new EventFiringWebDriver(baseClass.driver);
		File sourceImg = Edriver.getScreenshotAs(OutputType.FILE);
		File destination =new File("./screenShot/"+TestName+".png");
		try
		{
			FileUtils.copyFile(sourceImg, destination);
		}
	catch(IOException e)
		{}
	
	
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
