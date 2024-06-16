package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class ReqresAPI {
    public static String LIST_USERS = Constants.BASE_URL+"/api/users?page={page}";
    public static String CREATE_USER = Constants.BASE_URL+"/api/users";
    public static String USER_WITH_ID = Constants.BASE_URL+"/api/users/{id}";
    public static String LOGIN_USER = Constants.BASE_URL+"/api/login";
    public static String SINGLE_USER = Constants.BASE_URL+"/api/users/{id}";
    public static String SINGLE_USER_RESORCES = Constants.BASE_URL+"/api/unknown/{id}";
    public static String REGISTER_USER = Constants.BASE_URL+"/api/register";

    @Step("Get list users")
    public void getlistUsers(int page){
        SerenityRest.given()
                .pathParam("page", page);

    }

    @Step("Get single user")
    public void getSingleUser(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    @Step("Get single user resources")
    public void  getSingleUserResources(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    @Step("Create new user")
    public void postCreateNewUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Login a user")
    public void postLoginUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Update_user")
    public void putUdpateUser(int id, File json){
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Update_user_patch")
    public void patchUpdateUser(int id, File json){
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Register_user")
    public void postRegisterUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Delete a user")
    public void deleteUser(int id){
        SerenityRest.given()
                .pathParam("id",id);
    }
}
