package labs.week2.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.println("Enter a number");
            int number = sc.nextInt();
            sum = sum + number;
        }
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
