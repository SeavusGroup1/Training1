package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;
import pages.common.PopupAlert;
import pages.common.SideMenu;
import pages.widgets.DoubleClickPage;

public class DoubleClick extends BaseTest {

    @Test
    public void doubleClick(){
        SideMenu sm =new SideMenu(getDriver());
        DoubleClickPage doubleClick=new DoubleClickPage(getDriver());
        PopupAlert alert = new PopupAlert(getDriver());

        sm.getDoubleClick();
        doubleClick.clickDoubleBtn();
        alert.popup("");
        doubleClick.rightClickBtn();
        doubleClick.clickEditThis();
        alert.popup("");




    }
}
