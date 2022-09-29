package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.EasyMock2Matchers.equalTo;

public class PUT {

    @Test
    public void putRequest(){

        String jsonString = "{\"id\": 2,\r\n"
                + "        \"employee_name\": \"Garrett Winters\",\r\n"
                + "        \"employee_salary\": 99999,\r\n"
                + "        \"employee_age\": 63,\r\n"
                + "        \"profile_image\": \"\"}";

        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update/2";

         Response response = given().contentType("application/json").body(jsonString).when().put().then().extract().response();

         Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Salary : "+ response.jsonPath().getString("data.employee_salary"));
        Assert.assertEquals(Integer.parseInt(response.jsonPath().getString("data.employee_salary")) , 99999);

    }
}
