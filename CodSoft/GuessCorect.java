import java.util.Scanner;

public class GuessCorect {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess;

        do {
            System.out.print("Enter your guess (between 1 and 100): ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Try a higher number!");
            } else if (userGuess > randomNumber) {
                System.out.println("Try a lower number!");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }
}

