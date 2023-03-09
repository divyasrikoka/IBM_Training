package restassured;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;



class restasssuredjunit {

	@Test
	void test() {
		RestAssured.baseURI="https://api.genderize.io/";
		RequestSpecification myRequest=RestAssured.given();
		myRequest.queryParam("name", "divya");
		Response response=myRequest.get("");
		int statusCode=response.getStatusCode();
		assertEquals(200,statusCode);
		System.out.println(response.getStatusLine());
		assertEquals("HTTP/1.1 200 OK",response.getStatusLine());
		response.headers();
		for(Header hd:response.headers()) {
			System.out.println("name:="+hd.getName());
			System.out.println("value:="+hd.getValue());
			
		}
		ResponseBody  resBody=response.getBody();
		//System.out.println(resBody.asString());
		//assertEquals(resBody.asString().contains("divya"),true);
		JsonPath responsePath=response.jsonPath();
		String myName=responsePath.get("name");
		System.out.println(myName);
		System.out.println(resBody.asString());
		assertEquals(resBody.asString().contains("divya"),true);
		
	}

}
