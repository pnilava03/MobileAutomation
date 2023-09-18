package com.apple.Tests;

import com.apple.Utils.Driver;
import com.apple.Utils.PropertiesFile;
import org.testng.annotations.Test;

import java.io.IOException;

public class Testing {


    @Test
    public void launchDriver() throws IOException {
        Driver.setUp(PropertiesFile.getProperty("AppURL"));
    }
}
