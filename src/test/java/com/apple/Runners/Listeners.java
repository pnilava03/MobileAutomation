package com.apple.Runners;

import com.apple.Utils.Report;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

class Listeners implements ITestListener {
        ExtentReports extentReports= Report.attachReports("apple.com Project Report");
        ExtentTest test;
        String screenShotsDir="./reports";
    @Override
    public void onTestStart(ITestResult result){
        test=extentReports.createTest(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        String passedTest=result.getName();
        test.log(Status.PASS,"Test Passed")
                .pass(MediaEntityBuilder.createScreenCaptureFromPath(screenShotsDir+passedTest+".png").build());


    }
    @Override
    public void onTestFailure(ITestResult result){
        String failedTest=result.getName();
        test.log(Status.FAIL,result.getThrowable())
                .fail(MediaEntityBuilder.createScreenCaptureFromPath(screenShotsDir+failedTest+".png").build());
    }
    @Override
    public void onTestSkipped(ITestResult result){
        test.log(Status.SKIP,"Test Skipped");

    }
    @Override
    public  void onFinish(ITestContext context){

        extentReports.flush();
    }

}
