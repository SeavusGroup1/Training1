package pages.widgets;

import misc.Base.BasePage;
import misc.BrowserFactory.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SwitchWindowsPage extends BasePage {

    public SwitchWindowsPage(Browser browser) {
        super(browser);
    }

    By newBrowserWindow = By.xpath("//button[@id='button1']");
    By newMessageWindow = By.xpath("//button[@onclick='newMsgWin()']");


    public void switchingWindows(){
        Set handles = browser.getDriver().getWindowHandles();
        String firstWinHandle = browser.getDriver().getWindowHandle();
        handles.remove(firstWinHandle);
        String winHandle = (String) handles.iterator().next();
        String secondWinHandle = winHandle;
        System.out.println(firstWinHandle);

        if (winHandle != firstWinHandle) {
            browser.getDriver().switchTo().window(secondWinHandle);
        }
        System.out.println(secondWinHandle);
    }


    public void clickNewBrowserWindow() {
        click(newBrowserWindow);
    }
    public void clickNewMessageWindow(){
        click(newMessageWindow);
    }


}
