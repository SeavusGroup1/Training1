package misc.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver startBrowser(WebDriver browserDriver,String browserName) {

        String appUrl = "https://demoqa.com/";

        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            browserDriver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver" , "./Drivers/geckodriver.exe");
            browserDriver = new FirefoxDriver();

        } else {
            System.out.println("We dont support this browser");
        }

        browserDriver.manage().window().maximize();
        browserDriver.get(appUrl);

        return browserDriver;

    }


    public static void quitBrowser(WebDriver browserDriver){
        browserDriver.quit();
    }

}

