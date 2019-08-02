package com.BriteERP.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;


    @BeforeMethod
    public static void getUrl(){
        driver=Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Long.valueOf(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @AfterMethod
    public static void tearDown(){
        WaitForSecond.waitForSecond(3);
        driver=Driver.closeDriver();
    }

}
