package com.es.automation.testing.common.hooks;

import com.google.inject.Inject;
import com.google.inject.Provider;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by balaji_mssr on 3/11/2018.
 */
public class ApplicationHooks {
    @Inject
    private Provider<WebDriver> driverProvider;

    @After(order = 99)
    public void closeDriver() {
        driverProvider.get().quit();
    }

    @After(order = 101)
    public void gathersLogs(Scenario scenario) {
        //Capture logs
    }

    @After(order = 100)
    public void takeScreenshot(Scenario scenario) throws IOException {
        File screenshotFile = ((TakesScreenshot) driverProvider.get())
                .getScreenshotAs(OutputType.FILE);

        scenario.embed(((TakesScreenshot) driverProvider.get())
                .getScreenshotAs(OutputType.BYTES), "image/png");

        FileUtils.copyFile(screenshotFile, new File("target/screenshot.png"));
    }
}
