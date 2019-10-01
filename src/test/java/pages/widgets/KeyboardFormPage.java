package pages.widgets;

import misc.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyboardFormPage extends BasePage {

    public KeyboardFormPage(WebDriver driver) {super(driver);}


        @FindBy(xpath = "//*[@id=\"userName\"]") WebElement name;
        @FindBy(xpath = "//*[@id=\"currentAddress\"]") WebElement currentAdress;
        @FindBy(xpath = "//*[@id=\"permanentAddress\"]") WebElement permanentAdress;
        @FindBy(xpath = "//*[@id=\"submit\"]") WebElement buttonSubmit;

        public void setName(String typeName){
            name.sendKeys(typeName);
        }
        public void setCurrentAdress(String typeCAdress){
            currentAdress.sendKeys(typeCAdress);
        }
        public void setPermanentAdress(String typePAdress){
            permanentAdress.sendKeys(typePAdress);
        }
        public void clickSubmitt(){
            buttonSubmit.click();
        }


}
