package AutoStore;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car truck2 = new Car("truck","Scania R 770",2005,200000.00);
        Car sedan2 = new Car("sedan","Ford Focus",2012,20000.00);
        Car sport2 = new Car("sport","Ferrari 360 Spider",2018,150000.00);
        Motorcycle yamaha2 = new Motorcycle("Yamaha YZF-R6",2018,1000000.00);
        Motorcycle harley2 = new Motorcycle("Harley Davidson Sportster 1200",2011,15000.00);

        List<Car>cars = Arrays.asList(truck2,sedan2,sport2);
        List<Motorcycle>motorcycles = Arrays.asList(yamaha2,harley2);

        CarStore carStore = new CarStore();
        carStore.setCars(cars);
        carStore.setMotorcycles(motorcycles);

        JaxbWorker.toXml(carStore);

        CarStore store = JaxbWorker.fromXml();
        System.out.println(store.toString());

        JacksonWorker.toJson(carStore);
        CarStore store1 = JacksonWorker.fromJson();
        System.out.println(store1.toString());
    }
}
