package misc.BrowserFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {

    public static WebDriver startBrowser(WebDriver browserDriver,String browserName) {
        
        Browser browserOpen=Browser.valueOf(browserName.toUpperCase());
        String appUrl = "https://demoqa.com/";

        switch (browserOpen) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
                browserDriver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
                browserDriver = new FirefoxDriver();
                break;
            default:
                break;
        }
        browserDriver.manage().window().maximize();
        browserDriver.get(appUrl);

        return browserDriver;

    }


    public static void quitBrowser(WebDriver browserDriver){
        browserDriver.quit();
    }

}

