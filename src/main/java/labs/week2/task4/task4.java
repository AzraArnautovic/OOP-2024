package labs.week2.task4;
import java.util.Scanner;

public class task4 {
    public static void getNumbersInRange() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the start number:");
        int start = Integer.parseInt(reader.nextLine());

        System.out.println("Type the end number:");
        int end = Integer.parseInt(reader.nextLine());


        if (start < end) {

            while (start <= end ) {
                System.out.println(start + 1);
                start++;
                end=end-1;
            }
        } else {
            while (end >= start) {
            System.out.println(start);
            start--;
        }
        }

        reader.close();
    }

    public static void main(String[] args) {
        getNumbersInRange();
}}
