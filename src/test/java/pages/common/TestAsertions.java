package pages.common;

import misc.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAsertions extends BasePage {
    public TestAsertions(WebDriver driver) {
        super(driver);}

        public void AssertCurrentURL(String textURL){
            driver.getCurrentUrl();
            Assert.assertTrue(driver.getCurrentUrl().contains(textURL));
        }

        public void AssertText(String expectedText,String actualText){
            Assert.assertTrue(expectedText.contains(actualText));
        }

    }
