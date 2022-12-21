package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
        Cookie cookie = new Cookie("disable_captcha", "1");
        driver.manage().addCookie(cookie);
    }

    public void fillField(By field, String value) {
        driver.findElement(field).sendKeys(value);
    }

    public void webDriverWaitElement(By element) {
        new WebDriverWait(driver, Duration.ofMillis(500), Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void webDriverWaitClick(By element) {
        new WebDriverWait(driver, Duration.ofMillis(500), Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(element)).click();
    }

}
