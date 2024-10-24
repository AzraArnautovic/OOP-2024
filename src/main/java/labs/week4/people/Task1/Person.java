package labs.week4.people.Task1;

public class Person {
    protected String name;
    protected String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + " " + address + "\n";
    }
}
