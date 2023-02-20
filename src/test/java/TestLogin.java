import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {

    public static WebDriver driver;
    public static PageLogin pageLogin;
    public static PageCreatePWD pageCreatePWD;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        pageLogin = new PageLogin(driver);
        pageCreatePWD = new PageCreatePWD(driver);
    }


    @Test
    public void checkTittle() {
        pageLogin.openPage();
        Assert.assertEquals(pageLogin.getTittle(), "NEOBANK для бізнесу");
        pageLogin.fillPhoneNumber();
        pageLogin.clickNext();
        driver.manage().window().maximize();
        Assert.assertEquals(pageCreatePWD.getTittleQR(), "Відкриття бізнес-рахунку можливе тільки через додаток NEOBANK для бізнесу");
    }

    @AfterTest
    public void close(){
        driver.quit();
    }
}
