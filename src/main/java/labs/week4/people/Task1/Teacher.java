package labs.week4.people.Task1;

public class Teacher extends Person {
private int salary;

public Teacher(String firstName, String lastName, int salary) {
    super(firstName, lastName);
    this.salary = salary;
}
 @Override
    public String toString() {
     return this.name + "\n" + this.address +"\n"+ "salary " + salary + " euros/month";
 }
}
