package reqres.SerializationDeserializtion;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClasses.PetStoreUserLibraary;

public class SerializationTest {
	
	@Test
	public void Serialization() throws JsonGenerationException, JsonMappingException, IOException {
		
		PetStoreUserLibraary obj = new PetStoreUserLibraary(101, "ABC", "Mr", "XYZ", "abc@gmail.com", "123654789", "9876543210", 1);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/petstoreuser.json"), obj);
		
	}

}
