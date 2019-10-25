package pages.common;

import misc.Base.BasePage;
import misc.BrowserFactory.Browser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PopupAlert extends BasePage {

    public PopupAlert(Browser browser) {
        super(browser);
    }

    public void popup(String popupText) {
        Alert alertDialog = browser.getDriver().switchTo().alert();
        String alertText = alertDialog.getText();
        Assert.assertTrue(alertText.contains(popupText));
        alertDialog.accept();
        System.out.println(alertText);

    }



}
