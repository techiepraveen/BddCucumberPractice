package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alertPage {

    WebDriver driver;

    public alertPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='JavaScript Alerts']")
    WebElement javascript_alert;

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement click_for_js_alert;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement clicks_for_js_confirm;
    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    WebElement click_for_js_prompt;

    public void javascriptalartpage(){
        javascript_alert.click();


    }
    public void jslert_click(){
        click_for_js_alert.click();

    }
    public void accept(){
        driver.switchTo().alert().accept();
    }
    public void dismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void enter_text(){
        driver.switchTo().alert().sendKeys("selenium");
    }

    public void js_confirm_click(){
        clicks_for_js_confirm.click();

    }
    public void js_prompt(){
        click_for_js_prompt.click();
    }
}
