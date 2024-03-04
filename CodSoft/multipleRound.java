import java.util.Random;
import java.util.Scanner;

public class multipleRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            playRound(random, scanner);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }

        } while (true);

        scanner.close();
    }

    private static void playRound(Random random, Scanner scanner) {
        int lowerBound = 1;
        int upperBound = 5;

        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        while (true) {
            System.out.print("Guess the number between " + lowerBound + " and " + upperBound + ": ");

            int userGuess = scanner.nextInt();

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }
    }
}

