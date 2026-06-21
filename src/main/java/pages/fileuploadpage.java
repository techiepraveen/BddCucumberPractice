package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fileuploadpage {

    WebDriver driver;

    public fileuploadpage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[text()='File Upload']")
    WebElement fileuploadpage;

    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement choosefile;
    @FindBy(id="file-submit")
    WebElement upload_btn;
    @FindBy(id="uploaded-files")
    WebElement uploadfile;

    public void fileuploadpageclick(){
        fileuploadpage.click();
    }

    public void clickchoosefile() throws InterruptedException {
        Thread.sleep(5000);
        //choosefile.click();
       // Thread.sleep(5000);
        choosefile.sendKeys("/Users/pravenprakash/IdeaProjects/practiceframeworkBDDCucumber/src/main/java/utils/file.jpeg");
    }
    public void clickuploadbtn(){
        upload_btn.click();
    }
    public void uploadedfile(){
        uploadfile.isDisplayed();
    }

}
