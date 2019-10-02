package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;
import pages.common.PopupAlert;
import pages.common.SideMenu;
import pages.widgets.KeyboardEventsPage;

public class KeyboardEventsTest extends BaseTest {

    @Test
    public void keyboardEventsTest(){
        //insert pages
        SideMenu sm = new SideMenu(getDriver());
        KeyboardEventsPage keyboardPage = new KeyboardEventsPage(getDriver());
        PopupAlert alert = new PopupAlert(getDriver());
        //start test
        sm.getMenuKeyboardEvents();
        keyboardPage.chooseFileUpload();
        keyboardPage.clickToUpload();
        alert.popup("Thanks, you have selected");


    }
}
