package labs.week2.task9;

public class task9 {
    public static void drawStarsPyramid(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        drawStarsPyramid(5);
    }

}
