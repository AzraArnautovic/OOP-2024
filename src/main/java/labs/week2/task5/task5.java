package labs.week2.task5;
import java.util.*;

public class task5 {
    public static void calculateNthPower() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the power");
        int power = Integer.parseInt(reader.nextLine());
        int sum = 1;

        for (int i = 1; i <= power; i++) {
            sum = sum * 2;
        }

        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {
        calculateNthPower();
    }
}
