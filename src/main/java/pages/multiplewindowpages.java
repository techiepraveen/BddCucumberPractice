package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class multiplewindowpages {
    WebDriver driver;
    public multiplewindowpages(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[text()='Multiple Windows']")
    WebElement multiplewindowpage;

     @FindBy(xpath = "//a[text()='Click Here']")
    WebElement opennewwindow;

     public void clickonmultiplewindowpage(){
         multiplewindowpage.click();
     }
     public void openingnewwindow(){
         opennewwindow.click();
     }


     public void closingchildwindow(){
         String parentwindow= driver.getWindowHandle();
         Set<String> windowhandles = driver.getWindowHandles();
        for(String window:windowhandles){
            if(!window.equals(parentwindow)){
                driver.switchTo().window(window);

            }

        }
         System.out.println(driver.getCurrentUrl());


     }


}
