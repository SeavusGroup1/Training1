package tests.interaction;

import misc.Base.BaseTest;
import org.testng.annotations.Test;
import pages.common.SideMenu;
import pages.common.TestAsertions;
import pages.interaction.DropPage;

public class DragAndDrop extends BaseTest {

    @Test
    public void dragAndDrop(){
        SideMenu sm = new SideMenu(getDriver());
        DropPage drop= new DropPage(getDriver());
        TestAsertions tstAssert = new TestAsertions(getDriver());


        sm.getMenuDragAndDrop();
        drop.dragAndDrop();
        tstAssert.AssertText(drop.getDropHereText(),"Dropped");


    }
}
