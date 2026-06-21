package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class dropdownPages {
    WebDriver driver;
    public dropdownPages(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//a[text()='Dropdown']")
    WebElement dropdownpage;

    @FindBy(id ="dropdown")
    WebElement dropdownoption;


    public void dropdownpage(){
        dropdownpage.click();
    }

    public void choosedropdown(){
        WebElement dropdown = dropdownoption;

        Select select = new Select(dropdown);

        select.selectByIndex(1);

    }
}
