package testCases;

import org.testng.annotations.Test;
import java.util.*;
import static io.restassured.RestAssured.*;
//import io.restassured.response.Response;
//import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import static org.hamcrest.Matchers.equalTo;

public class TC_putrequesttoupdateexisting {
	
	@Test
	public void putRequestToValidateExisting()
	{
		HashMap<String,String> datapost=new HashMap<String,String>();
		datapost.put("id", "1000");
		datapost.put("name","Pari");
		datapost.put("releaseDate", "2023-05-04T08:58:04.701Z");
		datapost.put("reviewScore","10");
		datapost.put("category", "string");
		datapost.put("rating", "string");
		
		given()
			.contentType("application/json")
			.body(datapost)
		.when()
			.put("http://localhost:8080/app/videogames/1000")
		.then()
			.statusCode(200)
			.log().body()
			.body("videoGame.id", equalTo("1000"))
			.body("videoGame.name",equalTo("Pari"));
			
	}

}
