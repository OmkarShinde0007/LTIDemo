package APITesting;

import org.junit.Assert;

import com.github.dockerjava.transport.DockerHttpClient.Response;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class GetAPI {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/api/";
		RequestSpecification apiRquest = RestAssured.given();
		apiRquest.header("Content-type","application/json");
		apiRquest.param("page",2);
		io.restassured.response.Response response = apiRquest.request(Method.GET,"users");
		System.out.println(response.getBody().toString());
		System.out.println(response.getStatusCode());
		Assert.assertEquals(200, response.getStatusCode());
		
	}
	
	

}

