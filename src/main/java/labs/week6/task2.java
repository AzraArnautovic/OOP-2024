package labs.week6;

public class task2 {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 6, 11};
        System.out.println("Index of smallest: " + indexOfSmallest(values));
    }

    public static int indexOfSmallest(int[] array){
        int smallestIndex = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[smallestIndex]){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

}
