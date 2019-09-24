package pages.common;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;
import misc.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.channels.ByteChannel;


public class SideMenu extends BasePage {
    public SideMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='https://demoqa.com/html-contact-form/']") WebElement menuHTMLForm;
    @FindBy(xpath = "//a[@href='https://demoqa.com/keyboard-events/']") WebElement menuKeyboardEvents;
    @FindBy(xpath = "//a[@href='https://demoqa.com/automation-practice-switch-windows/']") WebElement menuSwitchWindows;
    @FindBy(xpath = "//a[@href='https://demoqa.com/keyboard-events-sample-form/']") WebElement menuKeyboardForm;



    public WebElement getMenuHTMLForm() {
        return menuHTMLForm;

    }
    public WebElement getMenuKeyboardEvents() {
        return menuKeyboardEvents;
    }
    public WebElement getMenuSwitchWindows() {
        return menuSwitchWindows;
    }

    public WebElement getMenuKeyboardForm() {
        return menuKeyboardForm;
    }
}

