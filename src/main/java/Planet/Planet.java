package Planet;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement (name = "planet")
public class Planet {
    private String name;
    private List<Country> countries = new ArrayList<Country>();

    public Planet() {
    }

    public Planet(String name) {
        this.name = name;
    }
    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElementWrapper(name = "countries")
    @XmlElement(name = "country")
    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Planet.Planet{" +
                "name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }
}
