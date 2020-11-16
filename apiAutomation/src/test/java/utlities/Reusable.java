package utlities;

import io.restassured.path.json.JsonPath;

public class Reusable {
	
	public static JsonPath jsonpath(String response) {
		
		JsonPath js1 = new JsonPath(response);
		return js1;
	}

}
