package stepdefinitions;

import base.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.formAuthenticationPage;

public class formAuthentiation extends baseClass {

    pages.formAuthenticationPage formAuthenPage= new formAuthenticationPage(driver);
    @Given("user is on the formAuthentication")
    public void user_is_on_the_formAuthentication(){
    formAuthenPage.form_authentication_page();
    }
    @When("user enters {string} and {string}")
    public void user_enters_username_and_password(String username,String password) throws InterruptedException {
        Thread.sleep(5000);
        formAuthenPage.user_name(username);
        Thread.sleep(5000);
        formAuthenPage.pass_word(password);
    }
    @And("click on login button")
    public void click_on_login_button(){
        formAuthenPage.click_login();
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login(){
    formAuthenPage.successful_msg();
    }

    @Then("username, password and login field should be shown")
    public void username_password_and_login_field_should_be_shown(){
  formAuthenPage.display_password();
  formAuthenPage.display_username();
  formAuthenPage.display_login();
    }
}
