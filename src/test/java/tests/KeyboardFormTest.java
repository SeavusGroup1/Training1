package tests;

import misc.Base.BaseTest;
import org.testng.annotations.Test;

import pages.common.PopupAlert;
import pages.common.SideMenu;
import pages.widgets.KeyboardFormPage;

import java.io.IOException;

public class KeyboardFormTest extends BaseTest {

    @Test
    public void keyboardTest(){
        //insert pages
        SideMenu sm = new SideMenu(getDriver());
        KeyboardFormPage keyboardForm = new KeyboardFormPage(getDriver());
        PopupAlert alert = new PopupAlert(getDriver());
        //start test
        sm.getMenuKeyboardForm();
        keyboardForm.setName("Marko");
        keyboardForm.setCurrentAdress("Save Kovacevic");
        keyboardForm.setPermanentAdress("Save Kovacevic");
        keyboardForm.clickSubmitt();
        alert.popup("Thanks for submitting the information");

    }
}
