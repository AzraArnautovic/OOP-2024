package labs.week2.task7;

public class task7 {
    public static void drawStarsPyramid(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

                System.out.println();

        }
    }

    public static void main(String[] args) {
        drawStarsPyramid(5);
    }
}
