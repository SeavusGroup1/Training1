package pages.widgets;

import misc.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class SwitchWindowsPage extends BasePage {

    public SwitchWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id='button1']") WebElement newBrowserWindow;
    @FindBy(xpath = "//*[@id=\"page\"]/div[1]/div[2]/div[1]/a") WebElement menuBrowser2;

    public void switchingWidnows(){
        Set handles = driver.getWindowHandles();
        String firstWinHandle = driver.getWindowHandle();
        handles.remove(firstWinHandle);
        String winHandle = (String) handles.iterator().next();
        String secondWinHandle = winHandle;

        if (winHandle != firstWinHandle) {
            driver.switchTo().window(secondWinHandle);
            menuBrowser2.click();
        }
        System.out.println(secondWinHandle);
    }

    public void clickNewBrowserWindow() {
        newBrowserWindow.click();
    }
}
