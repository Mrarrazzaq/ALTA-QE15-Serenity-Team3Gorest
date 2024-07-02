package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;

public class DeletePostSteps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Delete post with id {int}")
    public void deletePostWithId(int postId) {
        gorestAPI.deletePost(postId);
    }

    @When("Send request delete post")
    public void sendRequestDeletePost() {
        SerenityRest.when().delete(gorestAPI.POST_WITH_ID);
    }
}
