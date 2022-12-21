package org.example;

import org.openqa.selenium.WebDriver;


public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void fillCheckoutPage(Config.COUNTRIES country) {
        if (country == Config.COUNTRIES.US) {
            webDriverWaitElement(Locators.formCardInfo);
            fillField(Locators.BillingFields.billingFirstName, DataProvider.billingInfo.getFirstName());
            fillField(Locators.BillingFields.billingLastName, DataProvider.billingInfo.getLastName());
            fillField(Locators.BillingFields.billingCardNumber, DataProvider.billingInfo.getCardNumber());
            fillField(Locators.BillingFields.billingDate, DataProvider.billingInfo.getExpirationDate());
            fillField(Locators.BillingFields.billingCvv, DataProvider.billingInfo.getCvv());
            webDriverWaitClick(Locators.Checkboxes.agreeCheckbox);

        } else if (country == Config.COUNTRIES.CA) {
            webDriverWaitElement(Locators.formBillingInfo);
            webDriverWaitClick(Locators.Checkboxes.agreeCheckbox);


        } else if (country == Config.COUNTRIES.UK) {
            webDriverWaitElement(Locators.formBillingInfo);
            webDriverWaitClick(Locators.Checkboxes.authorizedCheckbox);
            webDriverWaitClick(Locators.Checkboxes.emergencyCheckbox);

        }
        webDriverWaitClick(Locators.submitPayment);
    }
}
