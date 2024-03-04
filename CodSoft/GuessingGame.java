import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random random = new Random();

        int generatedNumber = random.nextInt(max - min + 1) + min;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number between " + min + " and " + max + ": ");
        int Guess = scanner.nextInt();
        if (Guess == generatedNumber) {
            System.out.println("Congratulations! Your guess is correct.");
        } else {
            System.out.println("Sorry, the correct number was: " + generatedNumber);
        }
        scanner.close();
    }
}
