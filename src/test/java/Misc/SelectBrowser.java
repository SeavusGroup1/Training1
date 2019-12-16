package Misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectBrowser {

    public WebDriver selectDriver (String browserName) {
        System.out.println("TEst sdfgsfdgdfhfg");
        WebDriver browserDriver = null;
        if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\nenad.pitra\\IdeaProjects\\TestProject\\Drivers\\chromedriver.exe");
            browserDriver = new ChromeDriver();
            System.out.println("Test chromePart 1");}

        else if (browserName.equalsIgnoreCase("FireFox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\nenad.pitra\\IdeaProjects\\TestProject\\Drivers\\geckodriver.exe");
            browserDriver = new FirefoxDriver();}
        else if (browserName.equalsIgnoreCase("Explorer")){
            System.setProperty("webdriver.ie.driver", "C:\\Users\\nenad.pitra\\IdeaProjects\\TestProject\\Drivers\\IEDriverServer.exe");
            browserDriver = new InternetExplorerDriver();}
        else {System.out.println("Browser type not defined!");}

        return browserDriver;
    }
}
