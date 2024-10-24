package labs.week4.Student;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> initialGrades = List.of(2.0, 3.0, 4.0);
        Student student = new Student("1235", initialGrades);

        student.addGrade(90);
        student.addGrade(85);
        //System.out.println("ID: " + student.getStudentID());
    }


}

