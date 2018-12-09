package com.es.automation.testing.configuration;

import com.google.inject.Provider;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by balaji_mssr on 3/11/2018.
 */
public class WebDriverFactory implements Provider<WebDriver> {


    @Override
    public WebDriver get() {
        ChromeDriverManager.getInstance().setup();
        return new ChromeDriver();
    }
}
