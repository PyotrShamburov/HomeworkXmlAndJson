package Planet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbTest {
    public void writeToXml(Planet planet){
        try {
            JAXBContext context = JAXBContext.newInstance(Planet.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            marshaller.marshal(planet,new File("Planet.Planet.xml"));
        }catch (JAXBException exception){
            System.out.println(exception);
        }
    }
    public Planet readAndCreateNewObject(){
        Planet planet = null;
        try {
            JAXBContext context = JAXBContext.newInstance(Planet.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            planet = (Planet) unmarshaller.unmarshal(new File("Planet.Planet.xml"));
        }catch (JAXBException exception){
            System.out.println(exception);
        }
        return planet;
    }
}
