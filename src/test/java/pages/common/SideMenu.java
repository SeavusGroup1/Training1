package pages.common;


import misc.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SideMenu extends BasePage {
    public SideMenu(WebDriver driver) {
        super(driver);
    }

    By menuHTMLForm=By.xpath("//a[@href='https://demoqa.com/html-contact-form/']");
    By menuKeyboardEvents=By.xpath("//a[@href='https://demoqa.com/keyboard-events/']");
    By menuSwitchWindows=By.xpath("//a[@href='https://demoqa.com/automation-practice-switch-windows/']");
    By menuKeyboardForm=By.xpath("//a[@href='https://demoqa.com/keyboard-events-sample-form/']");
    By menuDoubleClick=By.xpath("//a[@href='https://demoqa.com/tooltip-and-double-click/']");
    By menuDraggable=By.xpath("//a[@href='https://demoqa.com/draggable/']");
    By menuDragAndDrop=By.xpath("//a[@href='https://demoqa.com/droppable/']");
    By menuToolTip=By.xpath("//a[@href='https://demoqa.com/tooltip/']");
    By menuDatePicker=By.xpath("//a[@href='https://demoqa.com/datepicker/']");

    public void getMenuDatePicker(){
        click(menuDatePicker);
    }

    public void getMenuDragAndDrop(){
        click(menuDragAndDrop);
    }
    public void getMenuToolTip(){
        click(menuToolTip);
    }

    public void getMenuDraggable(){
        click(menuDraggable);
    }
    public void getMenuHTMLForm() {
        click(menuHTMLForm);

    }
    public void getMenuKeyboardEvents() {
        click(menuKeyboardEvents);
    }
    public void getMenuSwitchWindows() {
        click(menuSwitchWindows);
    }

    public void getMenuKeyboardForm() {
        click(menuKeyboardForm);
    }

    public void getDoubleClick() {
        click(menuDoubleClick);
    }
}


