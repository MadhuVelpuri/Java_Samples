package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GET {


    @Test
    public void getBookingIds(){

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        int bookingID = given().
                        when().get("/booking").then().extract().response().path("bookingid[0]");
        System.out.println("Booking id is : "+ bookingID);
        Response response = given().
                when().get("/booking/"+bookingID).then().extract().response();

        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.getBody().prettyPrint());

    }
}
