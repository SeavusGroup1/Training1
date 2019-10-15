package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;


public class DatePicker extends BaseTest {

    @Test
    public void pickCurrentDay(){

        sideMenu.getMenuDatePicker();
        datePickerPage.currentDate();


    }

}
