package pages.widgets;

import misc.Base.BasePage;
import misc.BrowserFactory.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DoubleClickPage extends BasePage {
    public DoubleClickPage(Browser browser) {
        super(browser);
    }

    By rightClickBtn=By.xpath("//*[@id='rightClickBtn']");
    By doubleClickBtn=By.xpath("//*[@id='doubleClickBtn']");
    By editThisBtn=By.xpath("//*[@id='rightclickItem']/div[1]");
    By hoverOverMe=By.xpath("//*[@id=\"tooltipDemo\"]");

    public void clickDoubleBtn(){
        doubleClick(doubleClickBtn);
    }
    public void rightClickBtn(){

        rightClick(rightClickBtn);
    }
    public void clickEditThis(){

        click(editThisBtn);
    }
    public void hoverField(){
        hoverElement(hoverOverMe);
    }


}
