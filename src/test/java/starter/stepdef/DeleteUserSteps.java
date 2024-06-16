package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

import javax.naming.directory.SearchResult;

public class DeleteUserSteps {

    @Steps
    ReqresAPI reqresAPI;
    @Given("Delete user with id {int}")
    public void deleteUserWithId(int userId) {
        reqresAPI.deleteUser(userId);
    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
        SerenityRest.when().delete(ReqresAPI.USER_WITH_ID);
    }
}
