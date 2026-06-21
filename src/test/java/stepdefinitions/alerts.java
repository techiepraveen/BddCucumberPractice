package stepdefinitions;

import base.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.alertPage;

public class alerts extends baseClass {
    alertPage alertPage= new alertPage(driver);
    @Given("user is on the javascript alert")
    public void user_is_on_the_javascript_alert(){
        alertPage.javascriptalartpage();
    }
    @When("user click for js Alert")
    public void user_click_for_js_Alert(){
        alertPage.jslert_click();

    }
    @Then("user should be able to handle alert")
    public void user_should_be_able_to_handle_alert(){
        alertPage.accept();
    }
    @When("user click for JS Confirm alert")
    public void user_click_for_JS_Confirm_alert(){
        alertPage.js_confirm_click();
    }
    @Then("user should be able to confirm or cancel the JS Confirm alert")
    public void user_should_be_able_to_confirm_or_cancel_the_JS_Confirm_alert(){
        alertPage.accept();
    }
    @When("user click for click for JS prompt")
    public void user_click_for_click_for_JS_prompt(){
        alertPage.js_prompt();
    }
    @Then("user should be able to confirm or cancel the click for JS prompt")
    public void user_should_be_able_to_confirm_or_cancel_the_click_for_JS_prompt(){
        alertPage.enter_text();
    }

    
}
