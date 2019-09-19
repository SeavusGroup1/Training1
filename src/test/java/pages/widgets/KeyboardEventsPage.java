package pages.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyboardEventsPage {

    @FindBy(xpath = "//*[@id=\"browseFile\"]") WebElement chooseFile;
    @FindBy(xpath = "//button[@id='uploadButton']") WebElement clickToUpload;

    public WebElement getChooseFile() {
        return chooseFile;
    }

    public WebElement getClickToUpload() {
        return clickToUpload;
    }
}
