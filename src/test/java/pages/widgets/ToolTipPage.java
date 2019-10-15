package pages.widgets;

import misc.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ToolTipPage extends BasePage {
    public ToolTipPage(WebDriver driver) {
        super(driver);
    }
    Actions actions=new Actions(driver);

    By yourAge = By.xpath("//*[@id=\"age\"]");
    By hoverText = By.xpath("//*[contains(@id,'ui-id')]");

    public void hoverYourAge() throws InterruptedException {
        actions.moveToElement(driver.findElement(yourAge)).perform();
        actions.moveByOffset(10,40).perform();

    }
}
