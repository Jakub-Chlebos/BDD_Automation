package com.sda.zdtestpol100.pages;

import com.sda.zdtestpol100.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public final RemoteWebDriver driver;

    public BasePage() {
        this.driver = WebDriverManager.Driver;
        PageFactory.initElements(this.driver, this);
    }
}
