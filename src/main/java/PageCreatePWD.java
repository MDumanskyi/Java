import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCreatePWD {
    private WebDriver driver;
    public static By qrCodeTittle = By.xpath("//*[@class='auth-form-title']");
    public PageCreatePWD(WebDriver driver){
        this.driver = driver;
    }
    public String getTittleQR() {
        return driver.findElement(qrCodeTittle).getText();
    }

}
