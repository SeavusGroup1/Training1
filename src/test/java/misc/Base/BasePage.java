package misc.Base;


import misc.BrowserFactory.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BasePage {
    private static final int TIMEOUT = 15;

    protected Browser browser;
    public WebDriverWait wait;
    public Actions action;

    public BasePage(Browser browser) {
        this.browser = browser;
        wait = new WebDriverWait(browser.getDriver(), TIMEOUT);
        action=new Actions(browser.getDriver());
    }


    //Actions
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public void click(By elementBy){
        waitVisibility(elementBy);
        action.click(browser.getDriver().findElement(elementBy)).perform();
    }

    public void writeText(By elementBy,String text){
        waitVisibility(elementBy);
        browser.getDriver().findElement(elementBy).sendKeys(text);
    }
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return browser.getDriver().findElement(elementBy).getText();
    }
    public void doubleClick(By elementBy){
        waitVisibility(elementBy);
        action.doubleClick(browser.getDriver().findElement(elementBy)).perform();
    }
    public void rightClick(By elementBy){
        waitVisibility(elementBy);
        action.contextClick(browser.getDriver().findElement(elementBy)).perform();
    }
    public void dragAndDrop(By elementBy,By elementBy2){
        waitVisibility(elementBy);
        action.dragAndDrop((browser.getDriver().findElement(elementBy)),(browser.getDriver().findElement(elementBy2))).perform();
    }
    public void hoverElement(By elementBy){
        waitVisibility(elementBy);
        action.moveToElement(browser.getDriver().findElement(elementBy)).perform();
    }
    public void AssertCurrentURL(String textURL){
        browser.getDriver().getCurrentUrl();
        Assert.assertTrue(browser.getDriver().getCurrentUrl().contains(textURL));
    }

    public void AssertText(String readText, String expectedText){
        Assert.assertTrue(readText.contains(expectedText));
    }
    public void AssertCurrentTitle(String title){
        browser.getDriver().getTitle();
        Assert.assertTrue(browser.getDriver().getTitle().contains(title));
    }


}

