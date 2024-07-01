package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;

public class DeleteUserSteps {

    @Steps
    GorestAPI gorestAPI;
    @Given("Delete user with id {int}")
    public void deleteUserWithId(int userId) {
        gorestAPI.deleteUser(userId);
    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
        SerenityRest.when().delete(gorestAPI.USER_WITH_ID);
    }
}
