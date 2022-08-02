package com.sda.zdtestpol100;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.sda.zdtestpol100.WebDriverManager.*;

public class FirstGoogleTest {
    private static String GOOGLE_URL = "https://www.google.com/";

    @BeforeEach
    void setUp() {
        startDriver();
    }

    @Test
    void firstTestInGoogle() throws InterruptedException {
        Driver.get(GOOGLE_URL);
        Thread.sleep(10000);
    }

    @AfterEach
    void tearDown() {
        destroyDriver();
    }
}
