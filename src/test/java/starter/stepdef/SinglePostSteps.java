package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;

public class SinglePostSteps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Get single posts with parameter id {int}")
    public void getSinglePostsWithParameterId(int id) {
        gorestAPI.getSinglePost(id);
    }

    @When("Send request get single posts")
    public void sendRequestGetSinglePosts() {
        SerenityRest.when().get(gorestAPI.POST_WITH_ID);
    }
}
