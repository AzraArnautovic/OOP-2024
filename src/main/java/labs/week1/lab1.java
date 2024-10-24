package tasks_lab1;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        //System.out.print("My name is Azra Arnautovic"); //task 1



        /*System.out.println("Hello world!");  //2
        System.out.print(" (And all the people of the world)");*/



        /*int secondsInMinute = 60;  //3
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;

        int secondsInYear = secondsInMinute * minutesInHour * hoursInDay * daysInYear;

        System.out.println("There are " + secondsInYear + " seconds in a year");*/



        /*Scanner reader = new Scanner(System.in); //4

        System.out.println("First integer: ");
        int firstInt = reader.nextInt();
        System.out.println("Second integer: ");
        int secondInt = parseInt(reader.nextInt());

        System.out.println("Sum of two integers is: " + (firstInt + secondInt));*/



       /* Scanner sc = new Scanner(System.in);  //5

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num>0) {
            System.out.println("Positive number");
        }
        else if (num<0) {
            System.out.println("Negative number");
        }
        else {
            System.out.println("Zero");
        }*/



        Scanner sc = new Scanner(System.in);  //6

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        if (n1> n2) {
            System.out.print("The greater number is: " + n1);
        } else if (n2 > n1) {
            System.out.print("The greater number is: " + n2);
        } else {
            System.out.print("Both numbers are equal");
        }

        sc.close();

    }
}