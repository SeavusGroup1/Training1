package pages.widgets;

import misc.Base.BasePage;
import misc.Excel.ReadExcelConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HTMLPage extends BasePage {

    public HTMLPage(WebDriver driver) {
        super(driver);
    }
   /* public String getFname(){
        ReadExcelConfig excel = new ReadExcelConfig("C:\\Users\\marko.z.petrovic\\IdeaProjects\\MarkoSelenium\\Files\\markoworkbook.xlsx");
        String fname = excel.getData(0,0,0);
        return fname;
    }*/


    @FindBy(xpath = "//input[@class='firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='lname']")
    WebElement lastName;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;

    public void userFirstName(String fname) {
        waitForElementToAppear(firstName);
        firstName.sendKeys(fname);
    }
    public void  userLastName(String lname){
        waitForElementToAppear(lastName);
        lastName.sendKeys(lname);

    }
    public void  clickSubmit(){
        waitForElementToAppear(submit);
        submit.click();
}
}
