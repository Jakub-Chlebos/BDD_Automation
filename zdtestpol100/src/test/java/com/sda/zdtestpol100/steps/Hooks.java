package com.sda.zdtestpol100.steps;

import com.sda.zdtestpol100.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("THIS IS SCENARIO NAME: " + scenario.getName());

        WebDriverManager.startDriver();
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Is scenario FAILED: " + scenario.isFailed());

        WebDriverManager.destroyDriver();
    }


}
