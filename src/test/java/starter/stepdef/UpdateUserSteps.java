package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;
import starter.utils.Constants;

import java.io.File;

public class UpdateUserSteps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Update user with parameter id {int} and valid json {string}")
    public void updateUserWithParameterIdAndValidJson(int id, String jsonFileName) {
        File jsonFile = new File(Constants.REQ_BODY+jsonFileName);
        gorestAPI.putUdpateUser(id, jsonFile);
    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.when().put(gorestAPI.USER_WITH_ID);
        if (SerenityRest.then().extract().statusCode() != 200) {
            System.out.println("Error response: " + SerenityRest.then().extract().body().asString());
        }
    }

    @When("Send request patch update user")
    public void sendRequestPatchUpdateUser() {
        SerenityRest.when().patch(gorestAPI.USER_WITH_ID);
    }
}
