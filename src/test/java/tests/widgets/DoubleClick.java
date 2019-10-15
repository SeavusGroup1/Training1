package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;


public class DoubleClick extends BaseTest {

    @Test
    public void doubleClick(){

        sideMenu.getDoubleClick();
        doubleClickPage.clickDoubleBtn();
        popupAlert.popup("");
        doubleClickPage.rightClickBtn();
        doubleClickPage.clickEditThis();
        popupAlert.popup("");
        doubleClickPage.hoverField();




    }
}
