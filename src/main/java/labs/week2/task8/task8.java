package labs.week2.task8;

public class task8 {
    public static void drawStarsInvertedPyramid(int n){
        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        drawStarsInvertedPyramid(5);
    }
}
