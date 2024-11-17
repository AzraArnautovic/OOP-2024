package labs.week6.generics;

import java.util.ArrayList;
import java.util.List;

public class ReversElements {
    public static <T> List<T> ReversElements(List<T> inputList) {
        List<T> reversedList = new ArrayList<T>();

        for (int i = inputList.size() - 1; i >= 0; i--) {
            reversedList.add(inputList.get(i));
        }
        return reversedList;
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        List<Integer> reversedList = ReversElements(intList);
        System.out.println("Reversed String List: " + reversedList);
    }


}
