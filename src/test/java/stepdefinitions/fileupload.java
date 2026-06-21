package stepdefinitions;

import base.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.fileuploadpage;

public class fileupload extends baseClass {
    fileuploadpage fileuploadpage= new fileuploadpage(driver);
    @Given("user is on the upload file page")
    public void user_is_on_the_upload_file_page() {
     fileuploadpage.fileuploadpageclick();
    }

    @When("user is trying to upload the file")
    public void user_is_trying_to_upload_the_file() throws InterruptedException {
fileuploadpage.clickchoosefile();
    }

    @Then("file should gets uploaded")
    public void file_should_gets_uploaded() {
    fileuploadpage.clickuploadbtn();
    }


    @Then("uploaded file should be shown on the website")
    public void uploaded_file_should_be_shown_on_the_website(){
        fileuploadpage.uploadedfile();
    }

}