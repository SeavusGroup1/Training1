package pages.common;

import misc.Base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class PopupAlert extends BasePage {

    public PopupAlert(WebDriver driver) {
        super(driver);
    }

    public void popup() {
        Alert alertDialog = driver.switchTo().alert();
        String alertText = alertDialog.getText();
        alertDialog.accept();
        System.out.println(alertText);

    }

}
