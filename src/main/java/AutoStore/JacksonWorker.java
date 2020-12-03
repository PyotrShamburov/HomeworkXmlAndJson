package AutoStore;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonWorker {
    public static void toJson(CarStore store){
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("MyCarStore.json"),store);
            System.out.println("Data has beet written.");
        }catch (IOException exception){
            System.out.println(exception.toString());
        }
    }
    public static CarStore fromJson(){
        CarStore store = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            store = mapper.readValue(new File("MyCarStore.json"), CarStore.class);
            System.out.println("Data has been read.");
        }catch (IOException exception){
            System.out.println(exception.toString());
        }
        return store;
    }
}
