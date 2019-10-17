package misc.Base;

import misc.BrowserFactory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.common.PopupAlert;
import pages.common.SideMenu;
import pages.common.TestAsertions;
import pages.interaction.DropPage;
import pages.widgets.*;

public class BaseTest {

    public WebDriver driver;
    public HTMLPage htmlPage;
    public PopupAlert popupAlert;
    public SideMenu sideMenu;
    public TestAsertions testAsertions;
    public DropPage dropPage;
    public DatePickerPage datePickerPage;
    public DoubleClickPage doubleClickPage;
    public KeyboardEventsPage keyboardEventsPage;
    public KeyboardFormPage keyboardFormPage;
    public SwitchWindowsPage switchWindowsPage;
    public ToolTipPage toolTipPage;

    @BeforeMethod
    public void startBrowser() {
        driver = BrowserFactory.startBrowser(driver, "chrome");
        htmlPage = new HTMLPage(driver);
        popupAlert = new PopupAlert(driver);
        sideMenu = new SideMenu(driver);
        testAsertions=new TestAsertions(driver);
        dropPage=new DropPage(driver);
        datePickerPage=new DatePickerPage(driver);
        doubleClickPage=new DoubleClickPage(driver);
        keyboardEventsPage=new KeyboardEventsPage(driver);
        keyboardFormPage=new KeyboardFormPage(driver);
        switchWindowsPage=new SwitchWindowsPage(driver);
        toolTipPage=new ToolTipPage(driver);

    }

    @AfterMethod
    public void quitBrowser() throws InterruptedException {
        Thread.sleep(4000);
        BrowserFactory.quitBrowser(driver);
    }


}
