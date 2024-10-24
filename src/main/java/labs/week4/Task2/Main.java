package labs.week4.Task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle( "Purple", FillType.FILLED, 3.0);
        circle.displayInfo();
        System.out.println();

        Rectangle rectangle = new Rectangle("Yellow", FillType.NOT_FILLED, 4.0, 6.0);
        rectangle.displayInfo();
    }
}
