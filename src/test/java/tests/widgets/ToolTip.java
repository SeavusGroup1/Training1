package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;


public class ToolTip extends BaseTest {
    @Test
    public void hoverElement() throws InterruptedException {

        sideMenu.getMenuToolTip();
        toolTipPage.hoverYourAge();
    }
}
