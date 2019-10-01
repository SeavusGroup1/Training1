package misc.Base;

import misc.BrowserFactory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        driver = BrowserFactory.startBrowser(driver, "chrome");
    }

    @AfterMethod
    public void quitBrowser() {
       // BrowserFactory.quitBrowser(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

}
