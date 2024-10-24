package labs.week4.ExtendedPerson;

public class Main {
    public static void main(String[] args) {
        ExtendedPerson person = new ExtendedPerson("Alice","Street", 30, "USA");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());


        person.setAge(31);
        person.setCountry("Canada");

        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Updated Country: " + person.getCountry());
    }
}

