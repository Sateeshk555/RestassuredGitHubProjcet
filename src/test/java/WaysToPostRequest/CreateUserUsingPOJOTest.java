package WaysToPostRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import PojoClasses.UserLibrary;
import io.restassured.http.ContentType;

public class CreateUserUsingPOJOTest {

	@Test
	public void createUserTest() {
		UserLibrary obj = new UserLibrary("Srivalli", "Trainer");
		
		given()
			.body(obj)
			.contentType(ContentType.JSON)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.log().all()
			.assertThat()
				.statusCode(201);
	}
	
}
