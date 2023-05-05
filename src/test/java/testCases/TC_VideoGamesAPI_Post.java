package testCases;
import org.testng.Assert;
import org.testng.annotations.*;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import java.util.*;
public class TC_VideoGamesAPI_Post {

	@Test
	public void post_addanewgame() {
		
		HashMap<String,String> data1=new HashMap<String,String>();
		data1.put("id","1000");
		data1.put("name","Kaviin");
		data1.put("releaseDate", "2023-05-04T08:58:04.701Z");
		data1.put("reviewScore","10");
		data1.put("category", "string");
		data1.put("rating", "string");
		
		Response res=
		
		given()
			.baseUri("http://localhost:8080/app")
			.contentType("application/json")
			.body(data1)
		.when()
			.post("/videogames")
		.then()
			.log()
			.body()
			.statusCode(200)
			.extract().response();
		
		String responsedata=res.asPrettyString();
		Assert.assertEquals(responsedata.contains("Record Added Successfully"), true);
		
		
		
	}
	
}
