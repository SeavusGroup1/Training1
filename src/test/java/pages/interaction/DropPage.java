package pages.interaction;

import misc.Base.BasePage;
import misc.BrowserFactory.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropPage extends BasePage {
    public DropPage(Browser browser) {
        super(browser);
    }


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
