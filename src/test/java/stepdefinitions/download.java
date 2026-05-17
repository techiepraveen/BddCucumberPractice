package stepdefinitions;

import base.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.downloadPage;


public class download extends baseClass {
    downloadPage downloadPage= new downloadPage(driver);
    @Given("user is on the downloadlinkpage")
    public void user_is_on_the_downloadlinkpage(){
        downloadPage.downloadpage_link_click();
    }
    @When("user clicks on inputdata link")
    public void user_clicks_on_inputdata_link(){
     downloadPage.inputdataoption_click();
    }
    @Then("that page should gets downloaded")
    public void that_page_should_gets_downloaded(){
        System.out.println("it downloaded");
    }
    @Then("input data link should be shown")
    public void input_data_link_should_be_shown(){
    downloadPage.inputdata_disaply();
    }
}
