package tests.interaction;

import misc.Base.BaseTest;
import org.testng.annotations.Test;


public class DragAndDrop extends BaseTest {

    @Test
    public void dragAndDrop(){

        sideMenu.getMenuDragAndDrop();
        dropPage.dragAndDrop();
        dropPage.AssertText(dropPage.getDropHereText(),"Dropped");


    }
}
