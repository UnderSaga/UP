package steps;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.RequestModel.UserModel;
import models.ResponseModel.UserResponseModel;

import static io.restassured.RestAssured.given;

public class ApiSteps {

    @Step("user list")
    public void getUserList()
    {
        Response response = (Response) given()
                .baseUri("https://reqres.in/")
                .when()
                .get("/api/users?page=2")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();
    }
    @Step("create user")
    public UserResponseModel postCreateUser(UserModel model)
    {
        return given()
                .baseUri("https://reqres.in/")
                .body(model)
                .when()
                .contentType(ContentType.JSON)
                .post("/api/users")
                .then()
                .assertThat()
                .statusCode(201)
                .extract().response().body().as(UserResponseModel.class);
    }
}
