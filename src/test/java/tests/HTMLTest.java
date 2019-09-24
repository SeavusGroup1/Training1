package tests;

import misc.Base.BaseTest;
import org.testng.annotations.Test;
import pages.widgets.HTMLPage;
import pages.common.SideMenu;


public class HTMLTest extends BaseTest {


@Test
    public void htmlTest(){

    HTMLPage htmlPage = new HTMLPage(getDriver());
        SideMenu sm = new SideMenu(getDriver());

        sm.getMenuHTMLForm().click();
        htmlPage.getFirstName().sendKeys(htmlPage.getFname());
        htmlPage.getLastName().sendKeys(htmlPage.getLname());
        htmlPage.getSubmit().click();


    }
}


