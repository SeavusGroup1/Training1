package pages.interaction;

import misc.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DropPage extends BasePage {
    public DropPage(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);

    By elementToDrag=By.xpath("//*[@id=\"draggable\"]");
    By dropSpace=By.xpath("//*[@id=\"droppable\"]");

    public void dragAndDrop(){
        dragAndDrop(elementToDrag,dropSpace);
    }

    public String getDropHereText() {
        readText(dropSpace);
        return readText(dropSpace);
    }
}
