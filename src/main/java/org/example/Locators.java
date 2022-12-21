package org.example;

import org.openqa.selenium.By;

public abstract class Locators {
    public static By submitNumber = By.xpath("//button[@data-test-automation-id='submit-number']");
    public static By submitUsers = By.xpath("//button[@data-test-automation-id='submit-users']");
    //public static By countUsers = (By.xpath("//input[@id='users-input']")).sendKeys("5");
    // TODO: 11/11/2022 add method for setting count of users

    public static class CompanyFields {
        public static By formContactInfo = By.xpath("//form[@id='form-contact-info']");
        public static By firstName = By.xpath("//input[@id='first-name']");
        public static By lastName = By.xpath("//input[@id='last-name']");
        public static By email = By.xpath("//input[@id='email']");
        public static By contactPhone = By.xpath("//input[@id='contact-phone']");
        public static By companyName = By.xpath("//input[@id='company-name']");
        public static By streetAddress = By.xpath("//input[@id='street-address']");
        public static By city = By.xpath("//input[@id='city']");
        public static By zip = By.xpath("//input[@id='zip']");
        public static By country = By.xpath("//div[@data-test-automation-id='country']");
        public static By countryActive = By.xpath("//div[@data-test-automation-id='country']//a[@class='is-active']");
        public static By state = By.xpath("//input[@id='state']");
        public static By submitCompanyInfo = By.xpath("//button[@data-test-automation-id='submit-company']");
    }

    public static By formCardInfo = By.xpath("//form[@id='form-card-info']");
    public static By formBillingInfo = By.xpath("//form[@id='form-billing-info']");

    public static class BillingFields {
        public static By billingFirstName = By.xpath("//input[@id='billing-first-name']");
        public static By billingLastName = By.xpath("//input[@id='billing-last-name']");
        public static By billingCardNumber = By.xpath("//input[@id='billing-card-number']");
        public static By billingDate = By.xpath("//input[@id='billing-expire-date']");
        public static By billingCvv = By.xpath("//input[@id='billing-cvv']");

    }

    public static class Checkboxes {
        public static By agreeCheckbox = By.xpath("//input[@data-test-automation-id='agree-checkbox']");
        public static By authorizedCheckbox = By.xpath("//input[@data-test-automation-id='authorized-checkbox']");
        public static By emergencyCheckbox = By.xpath("//input[@data-test-automation-id='emergency-checkbox']");

    }

    public static By submitPayment = By.xpath("//button[@data-test-automation-id='submit-payment']");

}
