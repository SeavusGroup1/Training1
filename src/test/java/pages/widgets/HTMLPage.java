package pages.widgets;

import misc.Base.BasePage;
import misc.Excel.ReadExcelConfig;
import org.openqa.selenium.By;
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
   String excelFile = System.getProperty("user.dir")+"\\Files\\markoworkbook.xlsx";
   ReadExcelConfig excel = new ReadExcelConfig(excelFile);


   public String readExcelName(){
       String name = excel.getData(0,0,0);
       return name;
   }

    By firstName=By.xpath("//input[@class='firstname']");
    By lastName=By.xpath("//input[@id='lname']");
    By country=By.xpath("//input[@name='country']");
    By subject=By.xpath("//textarea[@id='subject']");
    By submit=By.xpath("//input[@type='submit']");
    By googleLinkHere=By.partialLinkText("is here");

    public void userFirstName(String fname) {
        writeText(firstName,fname);
    }
    public void  userLastName(String lname){
        writeText(lastName,lname);
    }
    public void  countryName(String CountryName){
        writeText(country,CountryName);
    }
    public void  subjectText(String SubjectText){
        writeText(subject,SubjectText);
    }
    public void  clickSubmit(){
        click(submit);
    }
    public void linkGoogle(){
        click(googleLinkHere);
    }
}
