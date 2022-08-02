package com.sda.zdtestpol100;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverManager {

    public static RemoteWebDriver Driver;

    public static void startDriver(){

        switch (getBrowserName()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                Driver = new ChromeDriver();
                break;
            case "firefox":
                Driver = new FirefoxDriver();
                break;
            case "safari":
                Driver = new SafariDriver();
                break;
            default:
                throw new IllegalStateException("UNSUPPORTED BROWSER!!!!");
        }

    }

    public static void destroyDriver(){
        Driver.quit();
    }

    public static String getBrowserName(){
        return System.getProperty("browserName", "chrome");
    }


}
