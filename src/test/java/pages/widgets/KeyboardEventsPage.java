package pages.widgets;

import misc.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyboardEventsPage extends BasePage {

    public KeyboardEventsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"browseFile\"]") WebElement chooseFile;
    @FindBy(xpath = "//button[@id='uploadButton']") WebElement clickToUpload;


    public WebElement getChooseFile() {
        waitForElementToBeClickable(chooseFile);
        return chooseFile;
    }

    public WebElement getClickToUpload() {
        return clickToUpload;
    }
}
