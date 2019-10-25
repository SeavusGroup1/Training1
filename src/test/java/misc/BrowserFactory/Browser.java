package misc.BrowserFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser {

    private WebDriver driver;

    public Browser(){
        startBrowser("chrome");
    }

    public void startBrowser(String browserName) {

        BrowserEnum browserOpen=BrowserEnum.valueOf(browserName.toUpperCase());
        String appUrl = "https://demoqa.com/";
        switch (browserOpen) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                break;
        }
        driver.manage().window().maximize();
        driver.get(appUrl);
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public void quitBrowser(){
        driver.quit();
    }



}

