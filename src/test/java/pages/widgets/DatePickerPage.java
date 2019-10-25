package pages.widgets;

import misc.Base.BasePage;
import misc.BrowserFactory.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePickerPage extends BasePage {



    By dateField=By.xpath("//*[@id=\"datepicker\"]");

    public DatePickerPage(Browser browser) {
        super(browser);
    }

    public void currentDate(){
        Date today = new Date();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        writeText(dateField,dateFormat.format(today));


    }
}
