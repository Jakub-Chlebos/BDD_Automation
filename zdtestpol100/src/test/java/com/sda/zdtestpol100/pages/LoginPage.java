package com.sda.zdtestpol100.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "email")
    WebElement loginEmailField;

    @FindBy(how = How.ID, using = "passwd")
    WebElement passwordField;

    @FindBy(how = How.ID, using = "SubmitLogin")
    WebElement loginButton;

    @FindBy(how = How.CLASS_NAME, using = "alert")
    WebElement alertMessage;

    @FindBy(how = How.ID, using = "create-account_form")
    WebElement createAccountForm;

    public void fillLoginEmailField(String emailAddress){
        loginEmailField.clear();
        loginEmailField.sendKeys(emailAddress);
    }

    public void fillPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String getLoginErrorMessage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(alertMessage));
        return alertMessage.getText();
    }

}
