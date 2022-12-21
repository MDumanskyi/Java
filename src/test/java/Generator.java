import org.example.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Generator {

    private final Config.COUNTRIES signUpCountry = Config.COUNTRIES.CA;
    private final WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CompanyInfoPage companyInfoPage = new CompanyInfoPage(driver);
    protected CheckoutPage checkoutPage  = new CheckoutPage(driver);


    @BeforeTest
    public void start() {
        basePage.open("https://service-testenv-" + signUpCountry + ".com/office-v1.0/");
        companyInfoPage.providingAddressData(signUpCountry);
        companyInfoPage.createMail(Config.MAIL.TESTMAIL);
    }

    @Test
    public void generete() {
        basePage.webDriverWaitClick(Locators.submitNumber);
        basePage.webDriverWaitClick(Locators.submitUsers);
        companyInfoPage.webDriverWaitElement(Locators.CompanyFields.formContactInfo);
        companyInfoPage.fillField(Locators.CompanyFields.firstName, DataProvider.UserInfo.getFirstName());
        companyInfoPage.fillField(Locators.CompanyFields.lastName, DataProvider.UserInfo.getLastName());
        companyInfoPage.fillField(Locators.CompanyFields.companyName, DataProvider.UserInfo.getCompanyName());
        companyInfoPage.fillField(Locators.CompanyFields.email, CompanyInfoPage.getEmail());
        companyInfoPage.fillField(Locators.CompanyFields.contactPhone, CompanyInfoPage.getPhone());
        companyInfoPage.fillField(Locators.CompanyFields.streetAddress, CompanyInfoPage.getAddress());
        companyInfoPage.fillField(Locators.CompanyFields.city, CompanyInfoPage.getCity());
        companyInfoPage.fillField(Locators.CompanyFields.zip, CompanyInfoPage.getZip());
        companyInfoPage.setState();
        companyInfoPage.webDriverWaitClick(Locators.CompanyFields.submitCompanyInfo);
        checkoutPage.fillCheckoutPage(signUpCountry);
    }


}
