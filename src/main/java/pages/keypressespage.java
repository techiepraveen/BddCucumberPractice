package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class keypressespage {
    WebDriver driver;
   public keypressespage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }
    @FindBy(xpath = "//a[text()='Key Presses']")
    WebElement keypressespage;
    @FindBy(id="target")
    WebElement target;
    @FindBy(xpath = "//p[text()='You entered: BACK_SPACE']")
    WebElement backspace;


    public void clickonkeypresspage(){
        keypressespage.click();
    }
    public void target(){
        target.sendKeys(Keys.BACK_SPACE);
    }
    public void button_text(){
        backspace.isDisplayed();
    }
}
