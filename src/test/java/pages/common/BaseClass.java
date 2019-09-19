package pages.common;

import misc.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        driver = BrowserFactory.startBrowser(driver,"chrome");
    }

    @AfterMethod
    public void quitBrowser() {
       BrowserFactory.quitBrowser(driver);
    }

}
