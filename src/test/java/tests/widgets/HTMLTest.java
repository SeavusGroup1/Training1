package tests.widgets;

import misc.Base.BaseTest;
import org.testng.annotations.Test;
import pages.common.TestAsertions;
import pages.widgets.HTMLPage;
import pages.common.SideMenu;


public class HTMLTest extends BaseTest {


@Test
    public void htmlTest(){
        //insert pages
        HTMLPage htmlPage = new HTMLPage(getDriver());
        SideMenu sm = new SideMenu(getDriver());
        TestAsertions tstAsert= new TestAsertions(getDriver());
        //start test
        sm.getMenuHTMLForm();
        htmlPage.userFirstName(htmlPage.readExcelName());
        htmlPage.userLastName("Petrovic");
        htmlPage.countryName("Serbia");
        htmlPage.subjectText("Hello Serbia!");
        htmlPage.clickSubmit();
        tstAsert.AssertCurrentURL("https://demoqa.com/html-contact-form/onsubmitform");


    }
}


