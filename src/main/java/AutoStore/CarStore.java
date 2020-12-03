package AutoStore;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "carstore")
public class CarStore {
    private List<Car> cars = new ArrayList<Car>();
    private List<Motorcycle> motorcycles = new ArrayList<Motorcycle>();

    public CarStore() {
    }

    @XmlElement(name = "car")
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @XmlElement(name = "motorcycle")
    public List<Motorcycle> getMotorcycles() {
        return motorcycles;
    }

    public void setMotorcycles(List<Motorcycle> motorcycles) {
        this.motorcycles = motorcycles;
    }

    @Override
    public String toString() {
        return "CarStore{" +
                "cars=" + cars +
                ", motorcycles=" + motorcycles +
                '}';
    }
}
