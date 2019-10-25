package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;



public class HTMLTest extends BaseTest {

    @Test(priority = 1)
    public void htmlTest(){

        sideMenu.getMenuHTMLForm();
        htmlPage.userFirstName(htmlPage.readExcelName());
        htmlPage.userLastName("Petrovic");
        htmlPage.countryName("Serbia");
        htmlPage.subjectText("Hello Serbia!");
        htmlPage.clickSubmit();
        htmlPage.AssertCurrentURL("https://demoqa.com/html-contact-form/onsubmitform");
    }

    @Test(priority = 0)
    public void linkGoogle(){

        sideMenu.getMenuHTMLForm();
        htmlPage.linkGoogle();
        htmlPage.AssertCurrentURL("google");


    }
}


