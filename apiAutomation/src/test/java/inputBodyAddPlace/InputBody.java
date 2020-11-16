package inputBodyAddPlace;

public class InputBody {
	
public static String addplacefirst(){
		
		return "{ \r\n" + 
				"\r\n" + 
				"   \"location\":{ \r\n" + 
				"\r\n" + 
				"      \"lat\":-38.383494, \r\n" + 
				"\r\n" + 
				"      \"lng\":33.427362 \r\n" + 
				"\r\n" + 
				"   }, \r\n" + 
				"\r\n" + 
				"   \"accuracy\":50, \r\n" + 
				"\r\n" + 
				"   \"name\":\"Frontline house\", \r\n" + 
				"\r\n" + 
				"   \"phone_number\":\"(+91) 923 456 7890\", \r\n" + 
				"\r\n" + 
				"   \"address\":\"123 street address\", \r\n" + 
				"\r\n" + 
				"   \"types\":[ \r\n" + 
				"\r\n" + 
				"      \"shoe park\", \r\n" + 
				"\r\n" + 
				"      \"shoe\" \r\n" + 
				"\r\n" + 
				"   ], \r\n" + 
				"\r\n" + 
				"   \"website\":\"https://rahulshettyacademy.com\", \r\n" + 
				"\r\n" + 
				"   \"language\":\"French-IN\" \r\n" + 
				"\r\n" + 
				"} ";
		
	}

	public static String addplacebody(String house, String address){
		
		return "{ \r\n" + 
				"\r\n" + 
				"   \"location\":{ \r\n" + 
				"\r\n" + 
				"      \"lat\":-38.383494, \r\n" + 
				"\r\n" + 
				"      \"lng\":33.427362 \r\n" + 
				"\r\n" + 
				"   }, \r\n" + 
				"\r\n" + 
				"   \"accuracy\":50, \r\n" + 
				"\r\n" + 
				"   \"name\":\""+ house+"\", \r\n" + 
				"\r\n" + 
				"   \"phone_number\":\"(+91) 923 456 7890\", \r\n" + 
				"\r\n" + 
				"   \"address\":\""+address+"\", \r\n" + 
				"\r\n" + 
				"   \"types\":[ \r\n" + 
				"\r\n" + 
				"      \"shoe park\", \r\n" + 
				"\r\n" + 
				"      \"shoe\" \r\n" + 
				"\r\n" + 
				"   ], \r\n" + 
				"\r\n" + 
				"   \"website\":\"https://rahulshettyacademy.com\", \r\n" + 
				"\r\n" + 
				"   \"language\":\"French-IN\" \r\n" + 
				"\r\n" + 
				"} ";
		
	}
	public static String updateplacebody(String placeid, String newAddress){
		return "{\r\n" + 
				"   \"place_id\":\""+placeid+"\",\r\n" + 
				"   \"address\":\""+newAddress+"\",\r\n" + 
				"   \"key\":\"qaclick123\"\r\n" + 
				"}";
		
	}
	
}
