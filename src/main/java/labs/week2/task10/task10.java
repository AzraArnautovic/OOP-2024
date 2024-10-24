package labs.week2.task10;

import java.util.*;

public class task10 {
    public static int drawNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void guessNumber() {
        Scanner reader = new Scanner(System.in);
        int random_number = drawNumber();

        int attempts = 0;

        System.out.print("Guess the number: ");
        int guess = reader.nextInt();
        while (guess != random_number) {
            attempts++;
            if (guess > random_number) {
                System.out.println("Lower! - This is your " + attempts + " guess!");
            } else {
                System.out.println("Higher! - This is your " + attempts + " guess!");
            }
            guess = reader.nextInt();
        }
        System.out.println("You are correct!");
        System.out.println("You made " + (attempts + 1) + " guesses!");
    }

    public static void main(String[] args) {
        guessNumber();
    }
}

