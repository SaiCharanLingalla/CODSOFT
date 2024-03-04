import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        Random random = new Random();
        int generatedNumber = random.nextInt(max - min + 1) + min;
        Scanner scanner = new Scanner(System.in);

        int Guess;
        do {
            System.out.print("Guess the number between " + min + " and " + max + ": ");
            Guess = scanner.nextInt();

            if (Guess == generatedNumber) {
                System.out.println("Congratulations! Your guess is correct.");
            } else if (Guess < generatedNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        } while (Guess != generatedNumber);
        scanner.close();
    }
}

