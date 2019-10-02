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
    @FindBy(xpath = "//a[@href='https://demoqa.com/tooltip-and-double-click/']") WebElement menuDoubleClick;
    @FindBy(xpath = "//a[@href='https://demoqa.com/draggable/']") WebElement menuDraggable;
    @FindBy(xpath = "//a[@href='https://demoqa.com/droppable/']") WebElement menuDragAndDrop;

    public void setMenuDragAndDrop(){
        menuDragAndDrop.click();
    }

    public void setMenuDraggable(){
        menuDraggable.click();
    }
    public void getMenuHTMLForm() {
        menuHTMLForm.click();

    }
    public void getMenuKeyboardEvents() {
        menuKeyboardEvents.click();
    }
    public void getMenuSwitchWindows() {
        menuSwitchWindows.click();
    }

    public void getMenuKeyboardForm() {
        menuKeyboardForm.click();
    }

    public void getDoubleClick() {
        menuDoubleClick.click();
    }
}


