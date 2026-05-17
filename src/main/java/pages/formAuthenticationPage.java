package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class formAuthenticationPage {
    WebDriver driver;
    public formAuthenticationPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(id= "username")
    WebElement username;
    @FindBy (id="password")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    @FindBy(id="flash-messages")
    WebElement successfulmsg;

    @FindBy(xpath = "//a[@href='/login']")
    WebElement formAuthentication;
    public void user_name(String usrname){
        username.sendKeys(usrname);
    }
    public void form_authentication_page(){
        formAuthentication.click();
    }

    public void successful_msg(){
        successfulmsg.isDisplayed();
    }
    public void click_login(){
        submit.click();
    }
    public void pass_word(String pasword){
        password.sendKeys(pasword);
    }

    public void display_username(){
        username.isDisplayed();
    }

    public void display_password(){
        password.isDisplayed();
    }

    public void display_login(){
        submit.isDisplayed();
    }

}
