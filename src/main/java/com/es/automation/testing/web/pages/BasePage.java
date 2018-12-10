package com.es.automation.testing.web.pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;

/**
 * Created by balajiravivarman on 3/11/2018.
 */
public class BasePage {

    @Inject
    public WebDriver driver;

    public static int DEFAULT_ELEMENT_TIME_OUT = 2000;

    public void load() {
        driver.navigate().to("https://shop.eurosport.co.uk/");
        driver.manage().window().maximize();
    }

    public void waitTillContentVisible() {
        try {
            Thread.sleep(DEFAULT_ELEMENT_TIME_OUT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
