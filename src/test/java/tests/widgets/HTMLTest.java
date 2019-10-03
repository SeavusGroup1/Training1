package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;
import pages.common.TestAsertions;
import pages.widgets.HTMLPage;
import pages.common.SideMenu;


public class HTMLTest extends BaseTest {

    @Test(priority = 1)
    public void htmlTest(){
        //insert pages
        HTMLPage htmlPage = new HTMLPage(getDriver());
        SideMenu sm = new SideMenu(getDriver());
        TestAsertions tstAssert= new TestAsertions(getDriver());
        //start test
        sm.getMenuHTMLForm();
        htmlPage.userFirstName(htmlPage.readExcelName());
        htmlPage.userLastName("Petrovic");
        htmlPage.countryName("Serbia");
        htmlPage.subjectText("Hello Serbia!");
        htmlPage.clickSubmit();
        tstAssert.AssertCurrentURL("https://demoqa.com/html-contact-form/onsubmitform");
    }

    @Test(priority = 0)
    public void linkGoogle(){
        HTMLPage htmlPage = new HTMLPage(getDriver());
        SideMenu sm = new SideMenu(getDriver());
        TestAsertions tstAssert= new TestAsertions(getDriver());

        sm.getMenuHTMLForm();
        htmlPage.linkGoogle();
        tstAssert.AssertCurrentURL("google");


    }
}


