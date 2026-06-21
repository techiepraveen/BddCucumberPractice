package stepdefinitions;

import base.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.dropdownPages;

public class dropdown extends baseClass {
    dropdownPages dropdownpages= new dropdownPages(driver);


    @Given("user is on the dropdownpage")
    public void user_is_on_the_dropdownpage(){
        dropdownpages.dropdownpage();
    }
    @When("user clicks on the dropdown")
    public void user_clicks_on_the_dropdown(){

    }
    @Then("dropdown should have values")
    public void dropdown_should_have_values(){

    }

    @When("user is trying to choose the option")
    public void user_is_trying_to_choose_the_option(){
        dropdownpages.choosedropdown();
    }
    @Then("user should be able to choose from dropdown")
    public void user_should_be_able_to_choose_from_dropdown(){

    }
}
