package com.luma.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class LumaHook {

    public WebDriver driver;

    @Before
    public void startUp(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("lumaURL"));
    }

    @After
    public void tearDown(Scenario scenario){
        BrowserUtils.takeScreenShot(scenario, driver);
        driver.quit();
    }

}
