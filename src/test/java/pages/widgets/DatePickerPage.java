package pages.widgets;

import com.sun.org.apache.xerces.internal.xs.StringList;
import misc.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePickerPage extends BasePage {
    public DatePickerPage(WebDriver driver) {
        super(driver);
    }

    By dateField=By.xpath("//*[@id=\"datepicker\"]");

    public void currentDate(){
        Date today = new Date();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        writeText(dateField,dateFormat.format(today));


    }
}
