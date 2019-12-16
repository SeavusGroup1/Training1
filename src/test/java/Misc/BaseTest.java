package Misc;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest  {


    WebDriver driver = null;
    SelectBrowser selectBrowser = new SelectBrowser() ;

    //WebDriverWait wait=new WebDriverWait(driver, 20);
   // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.))

    @BeforeMethod
    public void startUp () {
        driver=selectBrowser.selectDriver("Chrome");
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize() ;
        System.out.println("Test before method ");
    }

  // @AfterClass
    //public void quitBrowser() {
     //       driver.quit();
  //  }
}


