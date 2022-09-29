package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class POST {

    @Test
    public void authToken(){

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        String payload = "{\n" +
                         " \"username\" : \"admin\" , \n" +
                         "  \"password\" : \"password123\" \n" +
                         " }";

        Response response = given().contentType("application/json").body(payload).
                            when().post("/auth").then().extract().response();

        String getToken = response.jsonPath().getString("token");
        System.out.println("Token is : "+ getToken);

    }


}