package pages.common;

import misc.Base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PopupAlert extends BasePage {

    public PopupAlert(WebDriver driver) {
        super(driver);
    }

    public void popup(String PopupText) {
        Alert alertDialog = driver.switchTo().alert();
        String alertText = alertDialog.getText();
        Assert.assertTrue(alertText.contains(PopupText));
        alertDialog.accept();
        System.out.println(alertText);

    }



}
