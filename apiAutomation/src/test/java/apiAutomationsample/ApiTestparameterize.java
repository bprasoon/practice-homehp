package apiAutomationsample;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utlities.Reusable;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import inputBodyAddPlace.InputBody;
public class ApiTestparameterize {

	@Test(dataProvider="placeupdate")
	public void place(String house, String address, String newadd1) {
		// Add place
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		String response=given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(InputBody.addplacebody(house,address)) //Passing house & address from dataprovider
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().response().asString();

		// update place
		
		JsonPath resp = Reusable.jsonpath(response);
		String placeid=resp.getString("place_id");
		System.out.println(placeid);
		
		String newAddress= newadd1; //passing new address from dataprovider
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(InputBody.updateplacebody(placeid, newAddress))
		.when().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		String newadd=given().queryParam("key", "qaclick123").queryParam("place_id", placeid).when().get("maps/api/place/get/json").then().statusCode(200)
		.body("address", equalTo(newAddress)).extract().response().asString();
		
		JsonPath add= Reusable.jsonpath(newadd);
		String address1=add.getString("address");
		System.out.println(address1);
		Assert.assertEquals(address1, newAddress);
	
		
	}
@DataProvider(name="placeupdate")
public Object[][] placea()
{
	return new Object[][]  {{"Frontline house","123 sample street","123 new address"},{"secondline house","234 new street","234 new address"},{"thirdline house","456 new street","456 new address"}};
}
	
}
