package pages.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwitchWindowsPage {

    @FindBy(xpath = "//button[@id='button1']") WebElement newBrowserWindow;

    public WebElement getNewBrowserWindow() {
        return newBrowserWindow;
    }
}
