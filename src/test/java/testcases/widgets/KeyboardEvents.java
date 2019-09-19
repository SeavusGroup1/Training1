package testcases.widgets;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.common.BaseClass;
import pages.common.SideMenuPage;
import pages.widgets.KeyboardEventsPage;

import java.util.concurrent.TimeUnit;

public class KeyboardEvents extends BaseClass {

        @Test(priority = 0,description = "Upload file")
        public void KeyboardEvents(){
            KeyboardEventsPage keyboardPage = PageFactory.initElements(driver,KeyboardEventsPage.class);
            SideMenuPage sm = PageFactory.initElements(driver,SideMenuPage.class);

            sm.getMenuKeyboardEvents().click();
            keyboardPage.getChooseFile().sendKeys("C:\\\\Users\\\\marko.z.petrovic\\\\Desktop\\\\text.txt");
            keyboardPage.getClickToUpload().click();
            Alert alertDialog = driver.switchTo().alert();
            String alertText = alertDialog.getText();
            alertDialog.accept();
            System.out.println(alertText);


    }

}
