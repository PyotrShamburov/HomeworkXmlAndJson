package AutoStore;

import com.sun.xml.internal.txw2.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"title","year","price"})
public class Car {
    private String category;
    private String title;
    private int year;
    private double price;

    public Car() {
    }

    public Car(String category, String title, int year, double price) {
        this.category = category;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    @XmlAttribute(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @XmlElement
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
