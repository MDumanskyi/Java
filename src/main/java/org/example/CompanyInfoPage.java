package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanyInfoPage extends BasePage {

    public CompanyInfoPage(WebDriver driver) {
        super(driver);
    }

    int random = CommonActions.randomProcessor(1000, 9999);

    private static String phone = null;
    private static String address = null;
    private static String city = null;
    private static String zip = null;
    private static String email = null;

    public void providingAddressData(Config.COUNTRIES country) {
        switch (country) {
            case US:
                phone = DataProvider.US.getPhone() + random;
                address = DataProvider.US.getAddress();
                city = DataProvider.US.getCity();
                zip = DataProvider.US.getZip();
                break;
            case CA:
                phone = DataProvider.CA.getPhone() + random;
                address = DataProvider.CA.getAddress();
                city = DataProvider.CA.getCity();
                zip = DataProvider.CA.getZip();
                break;
            case UK:
                phone = DataProvider.UK.getPhone() + random;
                address = DataProvider.UK.getAddress();
                city = DataProvider.UK.getCity();
                zip = DataProvider.UK.getZip();
                break;
        }
    }

    public void createMail(Config.MAIL mail) {
        switch (mail) {
            case TESTMAIL:
                email = DataProvider.UserInfo.getUserEmailName() + "+" + random + DataProvider.UserInfo.getTestmail();
                break;
            case PRODMAIL:
                email = DataProvider.UserInfo.getUserEmailName() + "+" + random + DataProvider.UserInfo.getProdmail();
                break;
        }
    }

    public void setState() {
        driver.findElement(Locators.CompanyFields.country).click();
        String valueOfCountry = driver.findElement(Locators.CompanyFields.countryActive).getText();

        if (valueOfCountry.equals(DataProvider.US.getCountry())) {
            driver.findElement(Locators.CompanyFields.state).click();
            String xpathState = "//span[contains(text(),'" + DataProvider.US.getState() + "')]";
            driver.findElement(By.xpath(xpathState)).click();
        } else if (valueOfCountry.equals(DataProvider.CA.getCountry())) {
            driver.findElement(Locators.CompanyFields.state).click();
            String xpathState = "//span[contains(text(),'" + DataProvider.CA.getState() + "')]";
            driver.findElement(By.xpath(xpathState)).click();
        } else if (valueOfCountry.equals(DataProvider.UK.getCountry())) {
            driver.findElement(Locators.CompanyFields.state).click();
            String xpathState = "//span[contains(text(),'" + DataProvider.UK.getState() + "')]";
            driver.findElement(By.xpath(xpathState)).click();
        }

    }

    public static String getPhone() {
        return phone;
    }

    public static String getAddress() {
        return address;
    }

    public static String getCity() {
        return city;
    }

    public static String getZip() {
        return zip;
    }

    public static String getEmail() {
        return email;
    }

}
