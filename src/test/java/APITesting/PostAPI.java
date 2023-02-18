package APITesting;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAPI {
	
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/api/";
		RequestSpecification apiRequest = RestAssured.given();
		JSONObject requestPayLoad = new JSONObject();
		requestPayLoad.put("name", "Ajay");
		requestPayLoad.put("Job", "Trainer");
		apiRequest.body(requestPayLoad.toJSONString());
		Response response = apiRequest.request(Method.POST, "/users");
		
		System.out.println(response.getBody().asString());
		
			
	}

}
