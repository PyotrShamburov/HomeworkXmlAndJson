package AutoStore;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbWorker {
    public static void toXml(CarStore carStore){
        try{
            JAXBContext context = JAXBContext.newInstance(CarStore.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            marshaller.marshal(carStore,new File("CarStoreMy.xml"));
        }catch (JAXBException ex){
            System.out.println(ex.toString());
        }
    }
    public static CarStore fromXml(){
        CarStore store = null;
        try {
            JAXBContext context = JAXBContext.newInstance(CarStore.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            store = (CarStore) unmarshaller.unmarshal(new File("CarStoreMy.xml"));
            return store;
        }catch (JAXBException ex){
            System.out.println(ex.toString());
        }
        return store;
    }
}
