package misc.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
    private static final int TIMEOUT = 5;

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions action;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT);
        action=new Actions(driver);
    }

    //Actions
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public void click(By elementBy){
        waitVisibility(elementBy);
        action.click(driver.findElement(elementBy)).perform();
    }

    public void writeText(By elementBy,String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
    public void doubleClick(By elementBy){
        waitVisibility(elementBy);
        action.doubleClick(driver.findElement(elementBy)).perform();
    }
    public void rightClick(By elementBy){
        waitVisibility(elementBy);
        action.contextClick(driver.findElement(elementBy)).perform();
    }
    public void dragAndDrop(By elementBy,By elementBy2){
        waitVisibility(elementBy);
        action.dragAndDrop((driver.findElement(elementBy)),(driver.findElement(elementBy2))).perform();
    }
    public void hoverElement(By elementBy){
        waitVisibility(elementBy);
        action.moveToElement(driver.findElement(elementBy)).perform();
    }









}

