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


    public void chooseFileUpload() {
        waitForElementToBeClickable(chooseFile);
        chooseFile.sendKeys(filePath);
    }

    public void clickToUpload() {
        clickToUpload.click();
    }

    String filePath="C:\\Users\\marko.z.petrovic\\IdeaProjects\\TrainingMarko\\Files\\text.txt";
}


