package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.gorest.GorestResponses;
import starter.gorest.GorestAPI;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ResponsesSteps {
    @Steps
    GorestAPI gorestAPI;

    @And("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }
    @Then("Status code should {int}")
    public void statusCodeShould(int statusCode) {

        SerenityRest.then().statusCode(statusCode);
    }

    @And("Response body name should be {string} and job should be {string}")
    public void responseBodyNameShouldBeAndJobShouldBe(String name, String email) {
        SerenityRest.and()
                .body(GorestResponses.NAME, equalTo(name))
                .body(GorestResponses.EMAIL, equalTo(email));
    }
    @And("Response body name should be token {string}")
    public void responseBodyNameShouldBeToken(String token) {
        SerenityRest.and()
                .body(GorestResponses.TOKEN, equalTo(token));
    }
//    @And("Response body page should be {string} and {string}")
//    public void responseBodyPageShouldBeAnd(String first_name, String last_name) {
//        SerenityRest.and()
//                .body(GorestResponses.FIRST_NAME, equalTo(first_name))
//                .body(GorestResponses.LAST_NAME, equalTo(last_name));
//    }

    @And("Response body page should be {string} and {string}")
    public void responseBodyPageShouldBeAnd(String name, String email) {
        SerenityRest.and()
                .body(GorestResponses.NAME, equalTo(name))
                .body(GorestResponses.EMAIL, equalTo(email));
    }

    @Then("Validate json schema {string}")
    public void validateJsonSchema(String fileName) {
        File jsonFile = new File(Constants.JSON_SCHEMA+fileName);
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(jsonFile));
    }

}
