package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestAPI;

public class SingleUserSteps {
    @Steps
    GorestAPI gorestAPI;

    @Given("Single user with id {int}")
    public void singleUserWithIdPage(int id) {
        gorestAPI.getSingleUser(id);
    }

//    @Given("Single user with id {string}")
//    public void singleUserWithId(String fileName) {
//        File fileJson = new File(Constants.REQ_BODY+fileName);
//        GorestAPI.getSingleUser(fileJson);
//    }

    @When("Send request get single user")
    public void sendRequestGetSingleUser() {
        SerenityRest.when().get(gorestAPI.SINGLE_USER);
    }

}
