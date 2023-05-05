package testCases;
import org.testng.annotations.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TC_VideoGameAPI_Get {

	@Test
	public void test_GetAllVideoGames()
	{
		given()
		.when()
		.get("http://localhost:8080/app/videogames")
		.then()
		.statusCode(200)
		.log()
		.all();

	}
}
