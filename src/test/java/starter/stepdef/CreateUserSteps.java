package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;
import starter.utils.Constants;

import java.io.File;

public class CreateUserSteps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Create new user with valid file json {string}")
    public void createNewUserWithValidFileJson(String fileName) {
        File fileJson = new File(Constants.REQ_BODY+fileName);
        gorestAPI.postCreateNewUser(fileJson);
    }

    @When("Send request post create user")
    public void sendRequestPostCreateUser() {
        SerenityRest.when().post(gorestAPI.CREATE_USER);
    }
}
