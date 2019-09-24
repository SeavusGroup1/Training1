package tests;

import misc.Base.BaseTest;
import org.testng.annotations.Test;
import pages.common.PopupAlert;
import pages.common.SideMenu;
import pages.widgets.KeyboardEventsPage;

public class KeyboardEventsTest extends BaseTest {

    @Test
    public void keyboardEventsTest(){

        SideMenu sm = new SideMenu(getDriver());
        KeyboardEventsPage keyboardPage = new KeyboardEventsPage(getDriver());
        PopupAlert alert = new PopupAlert(getDriver());

        sm.getMenuKeyboardEvents().click();
        keyboardPage.getChooseFile().sendKeys("C:\\\\Users\\\\marko.z.petrovic\\\\Desktop\\\\text.txt");
        keyboardPage.getClickToUpload().click();
        alert.popup();


    }
}
