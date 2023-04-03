package reqres.SerializationDeserializtion;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import PojoClasses.PetStoreUserLibraary;

public class DeserializationTest {
	
	@Test
	public void deserialization() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		PetStoreUserLibraary petstore = mapper.readValue(new File("./src/test/resources/petstoreuser.json"), PetStoreUserLibraary.class);
		
		System.out.println(petstore.id);
		System.out.println(petstore.username);
	}

}
