package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class RegisterUserSteps {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Register new user with valid file json {string}")
    public void registerNewUserWithValidFileJson(String fileName) {
        File fileJson = new File(Constants.REQ_BODY+fileName);
        reqresAPI.postRegisterUser(fileJson);
    }

    @When("Send request post register user")
    public void sendRequestPostRegisterUser() {
        SerenityRest.when().post(ReqresAPI.REGISTER_USER);
    }

    @Given("Register new user with invalid file json {string}")
    public void registerNewUserWithInvalidFileJson(String fileName) {
        File fileJson = new File(Constants.REQ_BODY+fileName);
        reqresAPI.postRegisterUser(fileJson);
    }
}
