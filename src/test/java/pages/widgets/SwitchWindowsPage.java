package pages.widgets;

import com.sun.xml.internal.bind.v2.model.core.ID;
import misc.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Set;

public class SwitchWindowsPage extends BasePage {

    public SwitchWindowsPage(WebDriver driver) {
        super(driver);
    }

    By newBrowserWindow = By.xpath("//button[@id='button1']");
    By newMessageWindow = By.xpath("//button[@onclick='newMsgWin()']");


    public void switchingWindows(){
        Set handles = driver.getWindowHandles();
        String firstWinHandle = driver.getWindowHandle();
        handles.remove(firstWinHandle);
        String winHandle = (String) handles.iterator().next();
        String secondWinHandle = winHandle;
        System.out.println(firstWinHandle);

        if (winHandle != firstWinHandle) {
            driver.switchTo().window(secondWinHandle);
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
