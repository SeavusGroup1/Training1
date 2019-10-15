package tests.widgets;

import misc.Base.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class SwitchWindowTest extends BaseTest {

    @Test
    public void switchWindowsTest() {

        sideMenu.getMenuSwitchWindows();
        Reporter.log("Click on Side menu");
        switchWindowsPage.clickNewBrowserWindow();
        Reporter.log("Click on new window");
        switchWindowsPage.switchingWindows();
        Reporter.log("Switch window");
        testAsertions.AssertCurrentURL("https://www.toolsqa.com");

    }

}
