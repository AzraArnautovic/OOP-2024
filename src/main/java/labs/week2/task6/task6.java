package labs.week2.task6;

import java.util.Scanner;

public class task6 {
    public static void printText(int times) {
        String text = "In the beginning there were the swamp, the hoe and Java.";
        for (int i = 0; i <times; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times shall we print? ");
        int times = sc.nextInt();
        printText(times);
        sc.close();
    }}



