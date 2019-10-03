package pages.interaction;

import misc.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class DraggablePage extends BasePage {
    public DraggablePage(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);

    @FindBy(xpath = "//*[@id='draggable']")
    WebElement dragMeAround;
    @FindBy(xpath = "//*[@id='content']/div[1]")
    WebElement dragMeAPlace;

    public void dragMeAround(int xOffset,int yOffset){
        actions.clickAndHold(dragMeAround).perform();
        actions.moveByOffset(xOffset,yOffset).perform();
    }



}
