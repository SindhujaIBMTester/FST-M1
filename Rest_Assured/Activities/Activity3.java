package activities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Activity3 {
    RequestSpecification reqSpec;
    ResponseSpecification resSpec;
    @BeforeClass
    public void beforeMethod(){
        reqSpec  = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("https://petstore.swagger.io/v2/pet").build();
        resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).expectBody("status",equalTo("alive")).build();
    }

    @DataProvider
    public Object[][] petInfoProvider() {
        // Setting parameters to pass to test case
        Object[][] testData = new Object[][] {
                { 77232, "Riley", "alive" },
                { 77233, "Hansel", "alive" }
        };
        return testData;
    }

    @Test(priority = 0)
    public void addPets() {
        String reqBody = "{\"id\": 77232, \"name\": \"Riley\", \"status\": \"alive\"}";
        Response response;

        response = given().spec(reqSpec).body(reqBody).when().post();

        reqBody = "{\"id\": 77233, \"name\": \"Hansel\", \"status\": \"alive\"}";
        response = given().spec(reqSpec).body(reqBody).when().post(); // Send POST request
        System.out.println("Response POST:"+response.getBody().prettyPrint());
        // Assertions
        response.then().spec(resSpec); // Use responseSpec
    }
    @Test(dataProvider = "petInfoProvider", priority=1)
    public void getPets(int id,String name,String status) {
        System.out.println("Print ID:"+id);
        Response resp = given().spec(reqSpec) // Use requestSpec
                .pathParam("petId", id) // Add path parameter
                .when().get("/{petId}"); // Send GET request

        // Print response
        System.out.println(resp.asPrettyString());
        resp.then().spec(resSpec).body("name", equalTo(name));
    }

    // Test case using a DataProvider
    @Test(dataProvider = "petInfoProvider", priority=2)
    public void deletePets(int id, String name, String status) {
        Response res;
        res = given().spec(reqSpec).pathParam("petId", id).when().delete("/{petId}");

        res.then().body("code", equalTo(200));
    }
}
