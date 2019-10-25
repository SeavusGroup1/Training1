package pages.widgets;

import misc.Base.BasePage;
import misc.BrowserFactory.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipPage extends BasePage {
    public ToolTipPage(Browser browser) {
        super(browser);
    }
    Actions actions=new Actions(browser.getDriver());

    By yourAge = By.xpath("//*[@id=\"age\"]");
    By hoverText = By.xpath("//*[contains(@id,'ui-id')]");

    public void hoverYourAge() throws InterruptedException {
        actions.moveToElement(browser.getDriver().findElement(yourAge)).perform();
        actions.moveByOffset(10,40).perform();

    }
}
