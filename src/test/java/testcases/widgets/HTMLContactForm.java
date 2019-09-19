package testcases.widgets;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.common.BaseClass;
import pages.widgets.HTMLContactFormPage;
import pages.common.SideMenuPage;

import java.util.concurrent.TimeUnit;

public class HTMLContactForm extends BaseClass {

        @Test(priority = 0,description = "Input data in form")
        public void HTMLContactForm() {
            HTMLContactFormPage htmlPage = PageFactory.initElements(driver, HTMLContactFormPage.class);
            SideMenuPage sm = PageFactory.initElements(driver,SideMenuPage.class);

            sm.getMenuHTMLForm().click();
            htmlPage.getFirstName().sendKeys(htmlPage.getFname());
            htmlPage.getLastName().sendKeys(htmlPage.getLname());
            htmlPage.getSubmit().click();
            Assert.assertTrue(driver.getTitle().contains("Page not found"));
            System.out.println(driver.getTitle());

        }



    }


