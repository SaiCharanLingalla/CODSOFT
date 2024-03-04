import java.util.Random;
import java.util.Scanner;

public class Limit{
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;

        int maxAttempts = 3;
        Random random = new Random();

        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        Scanner scanner = new Scanner(System.in);

        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Guess the number between " + lowerBound + " and " + upperBound + ": ");

            int userGuess = scanner.nextInt();

            attempts++;

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + generatedNumber);
        }

        scanner.close();
    }
}
