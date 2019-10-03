package tests.interaction;

import misc.Base.BaseTest;
import org.testng.annotations.Test;
import pages.common.SideMenu;
import pages.interaction.DraggablePage;

public class Draggable extends BaseTest {

    @Test
    public void draggable(){

        SideMenu sm = new SideMenu(getDriver());
        DraggablePage drag=new DraggablePage(getDriver());

        sm.getMenuDraggable();
        drag.dragMeAround(50,100);


    }
}
