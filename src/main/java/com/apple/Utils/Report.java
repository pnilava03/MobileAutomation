package com.apple.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.an.E;

public class Report {
    public static ExtentSparkReporter reporter= new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//apple.html");
    public static ExtentReports extentReports;


    public static ExtentReports attachReports(String projectName){
        reporter.config().setReportName(projectName);
        reporter.config().setDocumentTitle("Apple Test Automation report");
        extentReports= new ExtentReports();
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("OS ::",System.getProperty("os.name"));
        extentReports.setSystemInfo("UserName ::",System.getProperty("user.name"));
        extentReports.setSystemInfo("Java Version",System.getProperty("java.version"));
        extentReports.setSystemInfo("Selenium Version",System.getProperty("selenium.version"));
        return  extentReports;
    }
}
