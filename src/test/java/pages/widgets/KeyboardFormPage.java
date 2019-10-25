package pages.widgets;

import misc.Base.BasePage;
import misc.BrowserFactory.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyboardFormPage extends BasePage {

    public KeyboardFormPage(Browser browser) {
        super(browser);}

        By name = By.xpath("//*[@id=\"userName\"]");
        By currentAdress = By.xpath("//*[@id=\"currentAddress\"]");
        By permanentAdress = By.xpath("//*[@id=\"permanentAddress\"]");
        By buttonSubmit = By.xpath("//*[@id=\"submit\"]");

        public void setName(String typeName){
            writeText(name,typeName);
        }
        public void setCurrentAdress(String typeCAdress){
            writeText(currentAdress,typeCAdress);
        }
        public void setPermanentAdress(String typePAdress){
            writeText(permanentAdress,typePAdress);
        }
        public void clickSubmitt(){
            click(buttonSubmit);
        }


}
