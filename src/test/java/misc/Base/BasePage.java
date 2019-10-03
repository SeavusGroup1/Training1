package misc.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    private static final int TIMEOUT = 5;

    protected WebDriver driver;
    private WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    protected void waitForElementToAppear(WebElement element){
            wait.until(ExpectedConditions.visibilityOf(element));
    }


    protected  String waitForElementToDisappear(WebElement element) {
        String strElement =element.toString();
        String[]elementSplit=strElement.split("xpath:");
        String xpathSTR=elementSplit[1];
        xpathSTR=xpathSTR.substring(0,xpathSTR.length()-1);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathSTR)));
        return xpathSTR;
    }

    protected void waitForElementToBeClickable (WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));


    }




}

