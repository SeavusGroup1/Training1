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

   /*public String readExcel(int x,int y,int z){
       String excelFile="C:\\Users\\marko.z.petrovic\\IdeaProjects\\TrainingMarko\\Files\\markoworkbook.xlsx";
       ReadExcelConfig excel = new ReadExcelConfig(excelFile);
       String data = excel.getData(x,y,z);
       return data;
   }*/

   String excelFile="C:\\Users\\marko.z.petrovic\\IdeaProjects\\TrainingMarko\\Files\\markoworkbook.xlsx";
   ReadExcelConfig excel = new ReadExcelConfig(excelFile);


   public String readExcelName(){
       String name = excel.getData(0,0,0);
       return name;
   }


    @FindBy(xpath = "//input[@class='firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='lname']")
    WebElement lastName;
    @FindBy(xpath = "//input[@name='country']")
    WebElement country;
    @FindBy(xpath = "//textarea[@id='subject']")
    WebElement subject;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;
    @FindBy(partialLinkText ="is here")WebElement googleLinkHere;

    public void userFirstName(String fname) {
        waitForElementToAppear(firstName);
        firstName.sendKeys(fname);
    }
    public void  userLastName(String lname){
        waitForElementToAppear(lastName);
        lastName.sendKeys(lname);

    }
    public void  countryName(String CountryName){
        waitForElementToAppear(country);
        country.sendKeys(CountryName);
    }
    public void  subjectText(String SubjectText){
        waitForElementToAppear(subject);
        subject.sendKeys(SubjectText);
    }
    public void  clickSubmit(){
        waitForElementToAppear(submit);
        submit.click();
    }
    public void linkGoogle(){
        googleLinkHere.click();
    }
}
