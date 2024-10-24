package labs.week2.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String correct_password = "apple";
        int correct = 0;
        while (correct != 1) {
            System.out.println("enter password");
            String user_password = reader.nextLine();

            if (correct_password.equals(user_password)) {
                correct = 1;
            }
        }
        System.out.println("secret is sugar");
    }
}



