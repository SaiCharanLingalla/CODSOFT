import java.util.Random;

public class RandomNumber{

    public static void main(String[] args) {
        generateAndPrintPINsStartingWith2();
    }

    public static void generateAndPrintPINsStartingWith2() {
        Random random = new Random();
        int pinCount = 10; // You can change this number based on your requirement

        System.out.println("PINs starting with 2:");

        for (int i = 0; i < pinCount; i++) {
            int pin = generateRandomPIN();
            if (String.valueOf(pin).startsWith("2")) {
                System.out.println(pin);
            }
        }
    }

    public static int generateRandomPIN() {
        Random random = new Random();
        int[] possibleDigits = {2, 3, 5, 6, 7, 8, 9};
        int pin = 0;

        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(possibleDigits.length);
            int digit = possibleDigits[randomIndex];
            pin = pin * 10 + digit;
        }

        return pin;
    }
}
