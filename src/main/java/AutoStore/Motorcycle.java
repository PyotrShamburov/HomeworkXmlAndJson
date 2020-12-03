package AutoStore;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"title","year","price"})
@XmlElement
public class Motorcycle {
    private String title;
    private int year;
    private double price;

    public Motorcycle() {
    }

    public Motorcycle(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;

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
        return "Motorcycle{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", owner='"+
                '}';
    }
}
