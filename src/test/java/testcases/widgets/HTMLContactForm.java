package testcases.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.common.BaseClass;
import pages.common.SideMenuPage;
import pages.widgets.HTMLContactFormPage;

public class HTMLContactForm extends BaseClass {


    @Test(priority = 0,description = "Input data in form")
        public void HTMLContactForm (){

            HTMLContactFormPage htmlPage = PageFactory.initElements(driver, HTMLContactFormPage.class);
            SideMenuPage sm = PageFactory.initElements(driver,SideMenuPage.class);

            //WebDriverWait wait = new WebDriverWait(driver,10);
            //wait.until(ExpectedConditions.visibilityOf(sm.getMenuHTMLForm()));

            sm.getMenuHTMLForm().click();
            htmlPage.getFirstName().sendKeys(htmlPage.getFname());
            htmlPage.getLastName().sendKeys(htmlPage.getLname());
            htmlPage.getSubmit().click();
            Assert.assertTrue(driver.getTitle().contains("Page not found"));
            System.out.println(driver.getTitle());

        }

    }


