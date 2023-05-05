package testCases;
import org.testng.Assert;
import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import static org.hamcrest.Matchers.equalTo;

public class TC_GetbasedonID
{
	@Test
	public void getbasedonid() {
		
	
	RestAssured
	.given()
	.contentType("application/json")
	.when()
	.get("http://localhost:8080/app/videogames/1000")
	.then()
	.statusCode(200)
	.body("videoGame.id",equalTo("1000"))
	.body("videoGame.name",equalTo("Spider-Man"))
	.log()
	.all();

	}

}
