package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scrollingpage {
    WebDriver driver;

    public scrollingpage(WebDriver driver){
      this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Infinite Scroll']")
    WebElement infinite_scroll;

    public void clickoninfinitescroll(){
        infinite_scroll.click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)");
    }
}
