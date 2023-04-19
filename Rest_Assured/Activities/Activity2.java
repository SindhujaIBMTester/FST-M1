package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Activity2 {

    final static String url = "https://petstore.swagger.io/v2/user";

    @Test(priority = 0)
    public void postReq() throws IOException {
        FileInputStream jsonInput = new FileInputStream("C:\\Users\\003SKG744\\IdeaProjects\\FST_RestAssured_Project\\src\\test\\java\\activities\\activity2.json");
        String reqFileContent = new String(jsonInput.readAllBytes());

        Response resp = given().contentType(ContentType.JSON).body(reqFileContent).when().post(url);
        jsonInput.close();

        System.out.println("Print response body:" + resp.getBody().prettyPrint());
    }

    @Test(priority = 1)
    public void getReq() throws IOException {
        File outputJSON = new File("src/test/java/activities/userGETResponse.json");

        Response resp = given().contentType(ContentType.JSON).pathParam("username", "sindhuja").when().get(url + "/{username}");
        // Get response body
        System.out.print("Response:" + resp.getBody().asPrettyString());
        resp.then().body("id", equalTo(2468));
        resp.then().body("username", equalTo("sindhuja"));

        try {
            // Create JSON file
            outputJSON.createNewFile();
            // Write response body to external file
            FileWriter writer = new FileWriter(outputJSON.getPath());
            writer.write(resp.getBody().asPrettyString());
            writer.close();
        } catch (IOException excp) {
            excp.printStackTrace();
        }

        // Assertion
        resp.then().body("id", equalTo(2468));
        resp.then().body("username", equalTo("sindhuja"));
        resp.then().body("firstName", equalTo("sindhuja"));
        resp.then().body("lastName", equalTo("Padmanabhan"));
        resp.then().body("email", equalTo("spadu@mail.com"));
        resp.then().body("password", equalTo("password123"));
        resp.then().body("phone", equalTo("9812763450"));
    }

    @Test(priority = 2)
    public static void deleteReq() throws IOException {
        Response resp = given().contentType(ContentType.JSON).pathParam("username", "sindhuja").when().delete(url + "/{username}");
        System.out.println("Response:"+resp.getBody().prettyPrint());
        resp.then().body("message",equalTo("sindhuja"));
        resp.then().body("code",equalTo(200));

    }
}
