package apiAutomationsample;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utlities.Reusable;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import inputBodyAddPlace.InputBody;
public class FirstApiTest {

	public static void main(String[] args) {
		// Add place
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(InputBody.addplacefirst())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().response().asString();

		// update place
		
		JsonPath resp = Reusable.jsonpath(response);
		String placeid=resp.getString("place_id");
		System.out.println(placeid);
		
		String newAddress= "123 New Address street";
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(InputBody.updateplacebody(placeid, newAddress))
		.when().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		String newadd=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeid).when().get("maps/api/place/get/json").then().log().all().statusCode(200)
		.body("address", equalTo(newAddress)).extract().response().asString();
		
		JsonPath add= Reusable.jsonpath(newadd);
		String address=add.getString("address");
		System.out.println(address);
		Assert.assertEquals(address, newAddress);
	
		
	}

}
