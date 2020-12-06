package Planet;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;


public class City {
    private String name;
    private List<Person> peoples = new ArrayList<Person>();

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElementWrapper(name = "people")
    @XmlElement(name = "person")
    public List<Person> getPeoples() {
        return peoples;
    }

    public void setPeoples(List<Person> peoples) {
        this.peoples = peoples;
    }

    @Override
    public String toString() {
        return "Planet.Planet.City{" +
                "name='" + name + '\'' +
                ", peoples=" + peoples +
                '}';
    }
}
