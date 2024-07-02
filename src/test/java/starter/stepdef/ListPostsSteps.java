package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;

public class ListPostsSteps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Get List posts with parameter page {int}")
    public void getListPostsWithParameterPage(int page) {
        gorestAPI.getlistPosts(page);
    }

    @When("Send request get list posts")
    public void sendRequestGetListPosts() {
        SerenityRest.when().get(gorestAPI.LIST_POSTS);
    }

    @Given("Get list posts with invalid parameter page {string}")
    public void getListPostsWithInvalidParameterPage(String stringHalaman) {
       gorestAPI.getListInvalidPosts(stringHalaman);
    }

}
