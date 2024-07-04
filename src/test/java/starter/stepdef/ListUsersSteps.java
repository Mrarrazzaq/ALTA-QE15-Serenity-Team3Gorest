package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestResponses;
import starter.gorest.GorestAPI;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ListUsersSteps {
    @Steps
    GorestAPI gorestAPI;

//    @Given("Get List users with parameter page {int}")
//    public void getListUsersWithParameterPage(int page) {
//        GorestAPI.getlistUsers(page);
//    }

    @Given("Get List users with parameter page")
    public void getListUsersWithParameterPage() {
        gorestAPI.getlistUsers();
    }

    @Given("Get List users with invalid parameter page {string}")
    public void getListUsersWithInvalidParameterPage(String page) {
        gorestAPI.getListUsersInvalid(page);
    }

    @When("Send request get list users")
    public void sendRequestGetListUsers() {
        SerenityRest.when().get(gorestAPI.LIST_USERS);
    }

    @When("Send request get list users invalid")
    public void sendRequestGetListUsersInvalid() {
        SerenityRest.when().get(gorestAPI.LIST_USERS_INVALID);
    }
}
