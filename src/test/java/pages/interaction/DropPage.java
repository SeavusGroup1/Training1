package pages.interaction;

import misc.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DropPage extends BasePage {
    public DropPage(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);

    @FindBy(xpath = "//*[@id=\"draggable\"]")WebElement dragMeToTarget;
    @FindBy(xpath = "//*[@id=\"droppable\"]")WebElement dropHere;

    public void dragAndDrop(){
        actions.dragAndDrop(dragMeToTarget,dropHere).perform();
    }

    public WebElement getDropHereText() {
        return dropHere;
    }
}
