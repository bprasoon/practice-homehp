package apiAutomationsample;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.AddPlace;
import pojo.location;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class AddplaceSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://rahulshettyacademy.com";
		AddPlace ap= new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress("123 Address street");
		ap.setLanguage("French-IN");
		location lp = new location();
		lp.setLat(-38.383494);
		lp.setLng(33.427362);
		ap.setLocation(lp);
		ap.setName("Frontline");
		ap.setPhone_number("(+91) 912 345 5671");
		ap.setWebsite("https://rahulshettyacademy.com");
		
		List<String> ty = new ArrayList<String>();
		ty.add("shoe park");
		ty.add("shop");
		ap.setTypes(ty);
		
		Response rep=given().queryParam("key", "qaclick123").body(ap).when().post("maps/api/place/add/json").
		then().assertThat().statusCode(200).extract().response();
		
		String resstr = rep.asString();
		System.out.println(resstr);
	}

}
