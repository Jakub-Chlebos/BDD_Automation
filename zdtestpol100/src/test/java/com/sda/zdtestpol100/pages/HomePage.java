package com.sda.zdtestpol100.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    private static String HOME_PAGE_URL = "http://automationpractice.com/index.php" ;

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    WebElement signInLink;

    @FindBy(how = How.ID, using = "homepage-slider")
    WebElement homePageSlider;

    public void openHomePage(){
        driver.get(HOME_PAGE_URL);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageSlider));
    }

    public void clickOnSignInLink(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(signInLink));
        signInLink.click();
    }


}
