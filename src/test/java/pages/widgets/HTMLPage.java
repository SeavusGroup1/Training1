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
    public String getFname(){
        ReadExcelConfig excel = new ReadExcelConfig("C:\\Users\\marko.z.petrovic\\IdeaProjects\\MarkoSelenium\\Drivers\\markoworkbook.xlsx");
        String fname = excel.getData(0,0,0);
        return fname;
    }


    //String fname = "Marko";
    String lname="Petrovic";

    @FindBy(xpath = "//input[@class='firstname']") WebElement firstName;
    @FindBy(xpath ="//input[@id='lname']") WebElement lastName;
    @FindBy(xpath = "//input[@type='submit']") WebElement submit;

   /* public void userName(){
        waitForElementToAppear(firstName);
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        submit.click();
    }*/

    public WebElement getLastName(){
        return lastName;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getSubmit(){
        return submit;
    }

   /* public String getFname() {
        return fname;
    }*/

    public String getLname() {
        return lname;
    }
}