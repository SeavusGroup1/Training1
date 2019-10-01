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

        sm.getMenuHTMLForm();
        htmlPage.userFirstName("Marko");
        htmlPage.userLastName("Petrovic");
        htmlPage.clickSubmit();

    }
}


