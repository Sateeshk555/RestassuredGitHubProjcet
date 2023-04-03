package reqres.CRUDOperrationsBDD;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
/*A static import allows public and static members of a class, such as fields and methods, 
 to be used in code without specifying the class name.*/
import org.testng.annotations.Test;

public class ResqestChainingGETAndDelete {

	@Test
	public void getAndDeleteUser() {
		baseURI = "https://reqres.in";
		Response resp = when().get("/api/user/2");

		int id = resp.jsonPath().get("data.id");
		resp.then().assertThat().statusCode(200).log().all();
		when().delete("/api/users/" + id).then().assertThat().statusCode(200).log().all();
	}

}
