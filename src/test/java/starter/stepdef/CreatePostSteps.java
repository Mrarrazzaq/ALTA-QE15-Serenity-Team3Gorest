package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;
import starter.utils.Constants;

import java.io.File;

public class CreatePostSteps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Create new post with file json {string}")
    public void createNewPostWithFileJson(String fileName) {
        File fileJson = new File(Constants.REQ_BODY+fileName);
        gorestAPI.postCreateNewPost(fileJson);
    }

    @When("Send request create post")
    public void sendRequestCreatePost() {
        SerenityRest.when().post(gorestAPI.CREATE_POST);
    }


}
