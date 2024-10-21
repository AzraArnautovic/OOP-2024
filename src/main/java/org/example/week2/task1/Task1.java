package org.example.week2.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String correctPassword = "apple" ;
        Scanner scanner = new Scanner(System.in);
        String inputpassword;
        do{
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();

            if (!inputPassword.equals(correctPassword)) {
                System.out.println("wrong password");

            } while (!inputPassword.equals(correctPassword));

        }
    }
}
