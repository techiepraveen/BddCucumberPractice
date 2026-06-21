package stepdefinitions;

import base.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.scrollingpage;

public class scrolling extends baseClass {
    scrollingpage scrollingpage= new scrollingpage(driver);

    @Given("user is on the infinite scroll")
    public void user_is_on_the_infinite_scroll(){
        scrollingpage.clickoninfinitescroll();
    }
    @When("user clicks on vertical scroll")
    public void user_clicks_on_vertical_scroll() throws InterruptedException {
        Thread.sleep(5000);
        scrollingpage.scroll();
    }
    @Then("vertical scroll should work")
    public void vertical_scroll_should_work() throws InterruptedException {
        Thread.sleep(10000);

    }
}
