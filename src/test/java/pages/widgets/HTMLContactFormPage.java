package pages.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HTMLContactFormPage {

    String fname = "Marko";
    String lname="Petrovic";


    @FindBy(xpath = "//input[@class='firstname']") WebElement firstName;
    @FindBy(xpath ="//input[@id='lname']") WebElement lastName;
    @FindBy(xpath = "//input[@type='submit']") WebElement submit;

    public WebElement getLastName(){
        return lastName;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getSubmit(){
        return submit;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
