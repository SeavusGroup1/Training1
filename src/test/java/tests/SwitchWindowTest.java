package tests;

import misc.Base.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.common.SideMenu;
import pages.widgets.SwitchWindowsPage;

public class SwitchWindowTest extends BaseTest {

    @Test
    public void switchWindowsTest() {
        SideMenu sm = new SideMenu(getDriver());
        SwitchWindowsPage switchWindow = new SwitchWindowsPage(getDriver());

        sm.getMenuSwitchWindows();
        Reporter.log("Click on Side menu");
        switchWindow.clickNewBrowserWindow();
        Reporter.log("Click on new window");
        switchWindow.switchingWidnows();
        Reporter.log("Switch window");

    }

}
