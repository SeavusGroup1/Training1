package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;


public class KeyboardFormTest extends BaseTest {

    @Test
    public void keyboardTest(){

        sideMenu.getMenuKeyboardForm();
        keyboardFormPage.setName("Marko");
        keyboardFormPage.setCurrentAdress("Save Kovacevic");
        keyboardFormPage.setPermanentAdress("Save Kovacevic");
        keyboardFormPage.clickSubmitt();
        popupAlert.popup("Thanks for submitting the information");

    }
}
