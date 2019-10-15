package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;

public class KeyboardEventsTest extends BaseTest {

    @Test
    public void keyboardEventsTest(){

        sideMenu.getMenuKeyboardEvents();
        keyboardEventsPage.chooseFileUpload();
        keyboardEventsPage.clickToUpload();
        popupAlert.popup("Thanks, you have selected");


    }
}
