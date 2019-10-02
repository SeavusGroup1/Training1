package pages.common;

import misc.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestAsertions extends BasePage {
    public TestAsertions(WebDriver driver) {
        super(driver);}

        public void AssertCurrentURL(String textURL){
            driver.getCurrentUrl();
            Assert.assertTrue(driver.getCurrentUrl().contains(textURL));
        }

        public void AssertText(WebElement element, String actualText){
            Assert.assertTrue(element.getText().contains(actualText));
        }
        public void AssertCurrentTitle(String title){
        driver.getTitle();
        Assert.assertTrue(driver.getTitle().contains(title));
    }

    }
