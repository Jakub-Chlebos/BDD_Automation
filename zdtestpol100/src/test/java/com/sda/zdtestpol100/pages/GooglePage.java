package com.sda.zdtestpol100.pages;

public class GooglePage extends BasePage {

    private static String GOOGLE_URL = "https://www.google.com/";

    public void openGooglePage(){
        driver.get(GOOGLE_URL);
    }


}
