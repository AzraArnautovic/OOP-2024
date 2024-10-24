package labs.week4.Student;
import java.util.*;

public class Student {
    private String studentID;
    private List<Double> grades;

    public Student(String studentID, List<Double> grades) {
        this.studentID = studentID;
        this.grades = new ArrayList<>(grades);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
    }
}
