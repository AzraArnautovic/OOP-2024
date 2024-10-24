package labs.week4.people.Task1;

public class Student extends Person {
 private int credits = 0;
    public Student(String name, String address) {
       super(name, address);
    }
public void Study(){
        credits++;
}
public int credits() {
        return credits;
}
@Override
    public String toString() {
        return "credits " + credits + "\n" + super.toString() ; //why super.tostring??
}
}
