package misc.Base;

import misc.BrowserFactory.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.common.PopupAlert;
import pages.common.SideMenu;
import pages.interaction.DropPage;
import pages.widgets.*;

public class BaseTest {

    protected HTMLPage htmlPage;
    protected PopupAlert popupAlert;
    protected SideMenu sideMenu;
    protected DropPage dropPage;
    protected DatePickerPage datePickerPage;
    protected DoubleClickPage doubleClickPage;
    protected KeyboardEventsPage keyboardEventsPage;
    protected KeyboardFormPage keyboardFormPage;
    protected SwitchWindowsPage switchWindowsPage;
    protected ToolTipPage toolTipPage;
    public Browser browser;

    @BeforeMethod
    public void startBrowser() {
        browser = new Browser();
        htmlPage = new HTMLPage(browser);
        popupAlert = new PopupAlert(browser);
        sideMenu = new SideMenu(browser);
        dropPage=new DropPage(browser);
        datePickerPage=new DatePickerPage(browser);
        doubleClickPage=new DoubleClickPage(browser);
        keyboardEventsPage=new KeyboardEventsPage(browser);
        keyboardFormPage=new KeyboardFormPage(browser);
        switchWindowsPage=new SwitchWindowsPage(browser);
        toolTipPage=new ToolTipPage(browser);

    }

    @AfterMethod
    public void quitBrowser() throws InterruptedException {
        Thread.sleep(4000);
        browser.quitBrowser();
    }


}
