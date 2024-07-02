package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;
import starter.utils.Constants;

import java.io.File;

public class UpdatePostSteps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Update post with parameter id {int} and valid json {string}")
    public void updatePostWithParameterIdAndValidJson(int id, String jsonFileName) {
        File jsonFile = new File(Constants.REQ_BODY+jsonFileName);
        gorestAPI.putUdpatePost(id, jsonFile);
    }

    @When("Send request update post")
    public void sendRequestUpdatePost() {
        SerenityRest.when().put(GorestAPI.POST_WITH_ID);
    }

    @Given("Update post with parameter id {int} and invalid json {string}")
    public void updatePostWithParameterIdAndInvalidJson(int id, String jsonFileName) {
        File jsonFile = new File(Constants.REQ_BODY+jsonFileName);
        gorestAPI.putUdpatePost(id, jsonFile);
    }
}
