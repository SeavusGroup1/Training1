package pages.widgets;

import misc.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyboardEventsPage extends BasePage {

    public KeyboardEventsPage(WebDriver driver) {
        super(driver);
    }

    String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\text.txt";

    By chooseFile=By.xpath("//*[@id=\"browseFile\"]");
    By clickToUpload=By.xpath("//button[@id='uploadButton']");


    public void chooseFileUpload() {
        writeText(chooseFile,filePath);
    }

    public void clickToUpload() {
        click(clickToUpload);
    }


}


