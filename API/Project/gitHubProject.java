package projects;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class gitHubProject {
    RequestSpecification reqSpec;
    ResponseSpecification resSpec;
    String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMHJAhXYl8vTST5zZmKQwSpx5cQVYRnbY/Sbvz+i2jPG";
    int id;
    @BeforeEach
    public void setUp(){
        reqSpec  = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization","token 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").setBaseUri("https://api.github.com/user/keys").build();
        resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).expectBody("status",equalTo("alive")).build();
    }

    @Test
    public void postMethod() {
        String reqBody = "{\"title\": \"TestAPIKey\", \"key\": \"ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMHJAhXYl8vTST5zZmKQwSpx5cQVYRnbY/Sbvz+i2jPG\"}";
        //Response response = given().spec(reqSpec).body(reqBody).when().post();
        Response response = given().spec(reqSpec).body(reqBody).when().post();
        System.out.println("Response POST:"+response.getBody().prettyPrint());
        id = response.then().extract().path("id");
        System.out.println("Print id:"+id);
    }

    @Test
    public void getMethod(int id) {
        Response resp = given().spec(reqSpec) // Use requestSpec
                .pathParam("keyId", id) // Add path parameter
                .when().get("/user/keys/{keyId}"); // Send GET request

        System.out.println("Response:" + resp.getBody().prettyPrint());
        resp.then().body("code", equalTo(200));
    }

    @Test
    public void deleteMethod(int id) {
       Response resp = given().spec(reqSpec).pathParam("petId", id).when().delete("/user/keys/{keyId}");

        System.out.println("Response:" + resp.getBody().prettyPrint());
        resp.then().body("code", equalTo(200));
    }
}
