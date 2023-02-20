import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageLogin {
    private WebDriver driver;
    By phoneNumber = By.xpath("//input[@id='login']");
    By loader = By.xpath("//div[@id='gal']");
    By loaderAfterClick = By.xpath("//spinner[@class='white spinner ng-star-inserted']");
    By buttonNext = By.xpath("//button[@id='btnNext']");
    String url = "https://web.neobank.one/";
    String phoneNumberIn = "+380636901699";

    public PageLogin(WebDriver driver) {
        this.driver = driver;
    }

    public String getTittle() {
        return driver.getTitle();
    }

    public void openPage() {
        driver.get(url);
        waitElementDisappear(loader);
    }

    public void waitElementDisappear(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void fillPhoneNumber() {
        driver.findElement(phoneNumber).sendKeys(phoneNumberIn);
    }

    public void clickNext() {
        driver.findElement(buttonNext).click();
        waitElementDisappear(loaderAfterClick);
    }
}
