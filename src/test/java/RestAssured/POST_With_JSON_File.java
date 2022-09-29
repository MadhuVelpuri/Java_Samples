package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class POST_With_JSON_File {


    @Test
    public void passFileAsPayload(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        File jsonFile = new File(System.getProperty("user.dir")+"/src/test/resources/scratch.json");

        Response response = given().contentType("application/json").body(jsonFile).
                when().post("/auth").then().extract().response();

        System.out.println("Response Code : "+ response.getStatusCode());
        System.out.println("Token is : "+ response.jsonPath().getString("token"));
        Assert.assertEquals(response.jsonPath().getString("token").length(), 15);




    }
}
