package aOLD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;
    String url = "https://demoqa.com/";

    @BeforeMethod
    public void beforeSuite() {

        String browserName = "Chrome";

        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver" , "./Drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        } else {
            System.out.println("We dont support this browser");
        }

        driver.manage().window().maximize();
        driver.get(url);

    }

   /* @AfterMethod
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }*/

    public WebDriver getDriver() {
        return driver;
    }
}