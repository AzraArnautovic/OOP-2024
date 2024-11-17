package labs.week6.generics;

import java.util.ArrayList;
import java.util.List;

public class SumEvenOdd {
    public static <T extends Number> void sumEvenOdd(List<T> list) {
        int evenSum = 0;
        int oddSum = 0;

        for (T num : list){
            int value = num.intValue();

            if (value % 2 == 0) {
                evenSum += value;
            }
            else {
                oddSum += value;
            }
        }
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        sumEvenOdd(numbers);

    }

}
