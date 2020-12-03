package Planet;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonTest {
    public void convertToJson(Planet planet){
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("Planet.Planet.json"), planet);
        }catch (IOException exception){
            System.out.println(exception.toString());
        }
    }
    public Planet getFromJson(){
        Planet planet = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            planet = mapper.readValue(new File("Planet.Planet.json"), Planet.class);
        }catch (IOException exception){
            System.out.println(exception.toString());
        }
        return  planet;
    }
}
