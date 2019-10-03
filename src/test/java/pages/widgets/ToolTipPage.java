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

    @FindBy(xpath ="//*[@id=\"age\"]")WebElement yourAge;
    @FindBy(xpath = "//*[contains(@id,'ui-id')]")WebElement hoverText;

    public void hoverYourAge() throws InterruptedException {
        actions.moveToElement(yourAge).perform();
        waitForElementToAppear(hoverText);
        actions.moveByOffset(10,40).perform();
        waitForElementToDisappear(hoverText);

    }
}
