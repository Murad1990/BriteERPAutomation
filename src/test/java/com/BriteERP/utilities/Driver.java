package com.BriteERP.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Time;

public class Driver {

    private static WebDriver driver;
    private Driver(){

    }
    public static WebDriver getDriver(){
       if(driver==null){
           if(ConfigurationReader.getProperty("browser").equals("chrome")){
               WebDriverManager.chromedriver().setup();
               driver=new ChromeDriver();
           }else if(ConfigurationReader.getProperty("browser").equals("firefox")){
               WebDriverManager.firefoxdriver().setup();
               driver=new FirefoxDriver();

           }else{
               throw new RuntimeException("Invalid browser");
           }
       }
       return driver;
    }



    public static WebDriver closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
        return driver;
    }


}
