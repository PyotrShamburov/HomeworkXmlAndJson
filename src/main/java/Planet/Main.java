package Planet;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people1 = Arrays.asList(
                new Person("Mike",23,"Male"),
                new Person("Elisa",21,"Female"));
        List<Person> people2 = Arrays.asList(
                new Person("Dan",24,"Male"),
                new Person("Ann",31,"Female"));
        List<Person> people3 = Arrays.asList(
                new Person("Louis",30,"Male"),
                new Person("Elly",29,"Female"));
        List<Person> people4 = Arrays.asList(
                new Person("John",19,"Male"),
                new Person("Jessica",13,"Female"));
        List<Person> people5 = Arrays.asList(
                new Person("Michael",40,"Male"),
                new Person("Natalya",25,"Female"));
        List<Person> people6 = Arrays.asList(
                new Person("Nicolas",36,"Male"),
                new Person("Elisabet",28,"Female"));

        City city1 = new City("London");
        city1.setPeoples(people1);
        City city2 = new City("Manchester");
        city2.setPeoples(people2);
        City city3 = new City("Rome");
        city3.setPeoples(people3);
        City city4 = new City("Milan");
        city4.setPeoples(people4);
        City city5 = new City("Vienna");
        city5.setPeoples(people5);
        City city6 = new City("Graz");
        city6.setPeoples(people6);

        List<City>cities1 = Arrays.asList(city1,city2);
        List<City>cities2 = Arrays.asList(city3,city4);
        List<City>cities3 = Arrays.asList(city5,city6);

        Country country1 = new Country("England");
        country1.setCities(cities1);
        Country country2 = new Country("Italy");
        country2.setCities(cities2);
        Country country3 = new Country("Austria");
        country3.setCities(cities3);

        List<Country> countries = Arrays.asList(country1,country2,country3);
        Planet earth = new Planet("Earth");
        earth.setCountries(countries);

        JaxbTest jaxbTest = new JaxbTest();
        jaxbTest.writeToXml(earth);

        Planet planet = jaxbTest.readAndCreateNewObject();

        JacksonTest jacksonTest = new JacksonTest();
        jacksonTest.convertToJson(planet);
        Planet planet1 = jacksonTest.getFromJson();
        System.out.println(planet1);
    }
}
