package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class downloadPage {
    WebDriver driver;
    public downloadPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[@href='/download']")
    WebElement downloadpagelink;

    @FindBy(xpath = "//a[text()='test_image.png']")
    WebElement inputdata;

    public void downloadpage_link_click(){
        downloadpagelink.click();
    }
    public void inputdata_disaply(){
        inputdata.isDisplayed();
    }
    public void inputdataoption_click(){
        inputdata.click();
    }
}
