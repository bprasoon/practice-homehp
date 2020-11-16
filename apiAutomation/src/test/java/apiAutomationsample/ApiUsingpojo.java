package apiAutomationsample;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import pojo.GetPlace;
import utlities.Reusable;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import inputBodyAddPlace.InputBody;
public class ApiUsingpojo {

	public static void main(String[] args) throws IOException {
		// Add place
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		GetPlace response=given().queryParam("key", "qaclick123").header("Content-Type","application/json")
				
				//Adding the input from external json file(in this case json stored in project)
		.body(new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/src/test/java/files/body.json")))) // first reading the file in byteformat and then changing it to String
		.when().post("maps/api/place/add/json").as(GetPlace.class);
		
		//response.getPlace_id()
		
		// update place
		
		//JsonPath resp = Reusable.jsonpath(response);
		//String placeid=resp.getString("place_id");
		System.out.println(response.getPlace_id());
		System.out.println(response.getId());
		System.out.println(response.getStatus());
		
		String newAddress= "123 New Address street";
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(InputBody.updateplacebody(response.getPlace_id(), newAddress))
		.when().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		String newadd=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", response.getPlace_id()).when().get("maps/api/place/get/json").then().log().all().statusCode(200)
		.body("address", equalTo(newAddress)).extract().response().asString();
		
		JsonPath add= Reusable.jsonpath(newadd);
		String address=add.getString("address");
		System.out.println(address);
		Assert.assertEquals(address, newAddress);
	
		
	}

}
