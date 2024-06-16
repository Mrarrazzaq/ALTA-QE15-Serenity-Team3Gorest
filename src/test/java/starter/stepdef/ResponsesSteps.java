package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ResponsesSteps {
    @Steps
    ReqresAPI reqresAPI;

    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }
    @Then("Status code should {int}")
    public void statusCodeShould(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @And("Response body name should be {string} and job should be {string}")
    public void responseBodyNameShouldBeAndJobShouldBe(String name, String job) {
        SerenityRest.and()
                .body(ReqresResponses.NAME, equalTo(name))
                .body(ReqresResponses.JOB, equalTo(job));
    }
    @And("Response body name should be token {string}")
    public void responseBodyNameShouldBeToken(String token) {
        SerenityRest.and()
                .body(ReqresResponses.TOKEN, equalTo(token));
    }
    @And("Response body name should be error {string}")
    public void responseBodyNameShouldBeError(String error) {
        SerenityRest.and()
                .body(ReqresResponses.ERROR, equalTo(error));
    }
    @And("Response body page should be {string} and {string}")
    public void responseBodyPageShouldBeAnd(String first_name, String last_name) {
        SerenityRest.and()
                .body(ReqresResponses.FIRST_NAME, equalTo(first_name))
                .body(ReqresResponses.LAST_NAME, equalTo(last_name));
    }
    @And("Response body page should be id {int} and token {string}")
    public void responseBodyPageShouldBeIdIdAndToken(int id, String token) {
        SerenityRest.and()
                .body(ReqresResponses.ID, equalTo(id))
                .body(ReqresResponses.TOKEN, equalTo(token));
    }

    @And("Validate json schema {string}")
    public void validateJsonSchema(String fileName) {
        File jsonFile = new File(Constants.JSON_SCHEMA+fileName);
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(jsonFile));
    }

}
