package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideMenuPage {

    @FindBy(xpath = "//a[@href='https://demoqa.com/html-contact-form/']") WebElement menuHTMLForm;
    @FindBy(xpath = "//a[@href='https://demoqa.com/keyboard-events/']") WebElement menuKeyboardEvents;
    @FindBy(xpath = "//a[@href='https://demoqa.com/automation-practice-switch-windows/']") WebElement menuSwitchWindows;

    public WebElement getMenuHTMLForm() {
        return menuHTMLForm;
    }
    public WebElement getMenuKeyboardEvents() {
        return menuKeyboardEvents;
    }
    public WebElement getMenuSwitchWindows() {
        return menuSwitchWindows;
    }
}
