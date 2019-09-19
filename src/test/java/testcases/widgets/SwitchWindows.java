package testcases.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.common.BaseClass;
import pages.common.SideMenuPage;
import pages.widgets.SwitchWindowsPage;

import java.util.Set;


public class SwitchWindows extends BaseClass {

    @Test
    public void SwitchWindows() {

        SideMenuPage sm = PageFactory.initElements(driver, SideMenuPage.class);
        SwitchWindowsPage switchWindows = PageFactory.initElements(driver, SwitchWindowsPage.class);

        sm.getMenuSwitchWindows().click();
        switchWindows.getNewBrowserWindow().click();

        Set handles = driver.getWindowHandles();
        String firstWinHandle = driver.getWindowHandle();
        handles.remove(firstWinHandle);
        String winHandle = (String) handles.iterator().next();
        String secondWinHandle = winHandle;

        if (winHandle != firstWinHandle) {
            driver.switchTo().window(secondWinHandle);
            driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div[2]/div[1]/a")).click();
        }
        System.out.println(secondWinHandle);
    }

}
