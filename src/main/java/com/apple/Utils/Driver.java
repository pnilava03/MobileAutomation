package com.apple.Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.IOException;
import java.net.URL;

public class Driver {

    public static  AndroidDriver driver;

    public static void setUp(String enterURL) throws IOException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName(PropertiesFile.getProperty("DeviceName"));
        options.setChromedriverExecutable(System.getProperty("user.dir")+PropertiesFile.getProperty("chromeDriver"));
        options.setCapability("browserName",PropertiesFile.getProperty("Browser"));
        driver= new AndroidDriver(new URL(" http://127.0.0.1:4723"),options);
        driver.get(enterURL);


    }
}
