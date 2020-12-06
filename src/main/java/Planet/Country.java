package Planet;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


public class Country {
    private String name;
    private List<City> cities = new ArrayList<City>();

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "city")
    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Planet.Planet.Country{" +
                "name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }
}
