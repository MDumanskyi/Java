package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.Random;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static int randomProcessor(int beginValue, int endValue) {
        Random generator = new Random((new Date()).getTime());
        if (endValue == beginValue) {
            return beginValue;
        } else {
            return endValue < beginValue ? beginValue : Math.abs(generator.nextInt()) % (endValue - beginValue) + beginValue;
        }
    }

}
