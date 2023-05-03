package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;

import static io.restassured.RestAssured.given;

public class Activity1 {

    final static String url = "https://petstore.swagger.io/v2/pet";

    @Test(priority = 0)
    public void postReq() {
        String reqBody = "{" +
                "  \"id\": 2468," +
                "  \"name\": \"Sindhu\"," +
                "  \"status\": \"alive\"" +
                "}";

        Response resp = given().contentType(ContentType.JSON).body(reqBody).when().post(url);

        resp.then().body("id", equalTo(2468));
        resp.then().body("name", equalTo("Sindhu"));
        resp.then().body("status", equalTo("alive"));
    }

    @Test(priority = 1)
    public void getReq() {
        Response resp = given().contentType(ContentType.JSON).when().pathParam("petId","2468").get(url+"/{petId}");
        resp.then().body("id", equalTo(2468));
        resp.then().body("name", equalTo("Sindhu"));
        resp.then().body("status", equalTo("alive"));
    }

    @Test(priority = 2)
    public void deleteReq() {
        Response resp = given().contentType(ContentType.JSON).when().pathParam("petId","2468").delete(url+"/{petId}");

        resp.then().body("code",equalTo(200));
        resp.then().body("message",equalTo("2468"));
    }
}
