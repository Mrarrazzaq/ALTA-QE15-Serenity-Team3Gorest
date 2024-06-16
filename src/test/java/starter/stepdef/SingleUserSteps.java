package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class SingleUserSteps {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Single user with id {int}")
    public void singleUserWithIdPage(int id) {
        reqresAPI.getSingleUser(id);
    }

//    @Given("Single user with id {string}")
//    public void singleUserWithId(String fileName) {
//        File fileJson = new File(Constants.REQ_BODY+fileName);
//        reqresAPI.getSingleUser(fileJson);
//    }

    @When("Send request get single user")
    public void sendRequestGetSingleUser() {
        SerenityRest.when().get(ReqresAPI.SINGLE_USER);
    }

    @When("Send request get single user resources")
    public void sendRequestGetSingleUserResources() {
        SerenityRest.when().get(ReqresAPI.SINGLE_USER_RESORCES);
    }
}
