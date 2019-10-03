package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;
import pages.common.SideMenu;
import pages.common.TestAsertions;
import pages.widgets.ToolTipPage;

public class ToolTip extends BaseTest {
    @Test
    public void hoverElement() throws InterruptedException {
        SideMenu sm =new SideMenu(getDriver());
        ToolTipPage tooltip=new ToolTipPage(getDriver());

        sm.getMenuToolTip();
        tooltip.hoverYourAge();
    }
}
