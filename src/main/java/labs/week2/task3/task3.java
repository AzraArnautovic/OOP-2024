package labs.week2.task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        Scanner sc = new Scanner(System.in);
        int number;
        int sum=0;

        while (true){
            number = sc.nextInt();
           if (number==0){
               break;
           }
           sum+=number;
        }
        System.out.println(sum);
        sc.close();
    }
}
