package stepdefinitions;

import base.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.keypressespage;

public class keypresses extends baseClass {
    keypressespage keypress= new keypressespage(driver);


    @Given("user is on the keypresspage")
    public void user_is_on_the_keypresspage(){
    keypress.clickonkeypresspage();
    }
    @When("user presses any key from keyboard")
    public void user_presses_any_key_from_keyboard(){
     keypress.target();
    }
    @Then("that key should be shown in UI")
    public void that_key_should_be_shown_in_UI(){
     keypress.button_text();
    }
}
