package pages.widgets;

import misc.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class DoubleClickPage extends BasePage {
    public DoubleClickPage(WebDriver driver) {
        super(driver);
    }
    Actions actions=new Actions(driver);


    @FindBy(xpath = "//*[@id='rightClickBtn']" )WebElement rightClickBtn;
    @FindBy(xpath = "//*[@id='doubleClickBtn']") WebElement doubleClickBtn;
    @FindBy(xpath = "//*[@id='rightclickItem']/div[1]")WebElement editThisBtn;

    public void clickDoubleBtn(){
        waitForElementToAppear(doubleClickBtn);
        actions.doubleClick(doubleClickBtn).perform();
    }
    public void rightClickBtn(){
        waitForElementToAppear(rightClickBtn);
        actions.contextClick(rightClickBtn).perform();
    }
    public void clickEditThis(){
        waitForElementToAppear(editThisBtn);
        actions.click(editThisBtn).perform();
    }

}
