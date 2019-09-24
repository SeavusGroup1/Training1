package tests;

import misc.Base.BaseTest;
import org.testng.annotations.Test;

import pages.common.PopupAlert;
import pages.common.SideMenu;
import pages.widgets.KeyboardFormPage;

import java.io.IOException;

public class KeyboardFormTest extends BaseTest {

    @Test
    public void KeyboardTest() throws IOException {

        SideMenu sm = new SideMenu(getDriver());
        KeyboardFormPage keyboardForm = new KeyboardFormPage(getDriver());
        PopupAlert alert = new PopupAlert(getDriver());
       /* ReadExcelConfig excel = new ReadExcelConfig("C:\\Users\\marko.z.petrovic\\IdeaProjects\\MarkoSelenium\\Drivers\\markoworkbook.xlsx");

        String marko = excel.getData(0,1,1);
        System.out.println(marko);*/
        sm.getMenuKeyboardForm().click();
        keyboardForm.submitForm("Marko","Karadjordjeva","Savina");
        alert.popup();

    }
}
