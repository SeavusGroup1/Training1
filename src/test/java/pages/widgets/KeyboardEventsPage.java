package pages.widgets;

import misc.Base.BasePage;
import misc.BrowserFactory.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyboardEventsPage extends BasePage {

    public KeyboardEventsPage(Browser browser) {
        super(browser);
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


