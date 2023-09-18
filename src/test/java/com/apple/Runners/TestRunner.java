package com.apple.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(
        features = {"./src/test/java/com/apple/Features"},
        glue = {"com.apple.stepDefinitions"},
        plugin = {"html:target/results.html", "message:target/results.ndjson"}
)


public class TestRunner extends  AbstractTestNGCucumberTests {




}
