package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC_deletearecord {
	
	@Test
	public void deleteARecord()
	{
		Response res=
		given()
		.when()
		.delete("http://localhost:8080/app/videogames/3")
		.then()
		.statusCode(200)
		.log()
		.body()
		.extract().response();
		
		String resdata2=res.asString();
		Assert.assertEquals(resdata2.contains("Record Deleted Successfully"), true);
		
		
	}

}
