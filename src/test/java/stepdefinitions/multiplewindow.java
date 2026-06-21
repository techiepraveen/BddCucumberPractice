package stepdefinitions;

import base.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.multiplewindowpages;

public class multiplewindow extends baseClass {

    multiplewindowpages multiplewindows= new multiplewindowpages(driver);
    @Given("user is on the multiple window")
    public void user_is_on_the_multiple_window(){
     multiplewindows.clickonmultiplewindowpage();
    }
    @When("user handle multple windows")
    public void user_handle_multple_windows(){
     multiplewindows.openingnewwindow();
    }
    @Then("user should be able to handle windows")
    public void user_should_be_able_to_handle_windows() throws InterruptedException {
        Thread.sleep(5000);
        multiplewindows.closingchildwindow();
    }

}
