import java.util.Scanner;

public class Atm{
    private double availableBalance;

    public Atm(double initialBalance) {
        this.availableBalance = initialBalance;
    }

    public void displayMainMenu() {
        System.out.println("ATM Main Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Available Balance: $" + availableBalance);
    }

    public void withdrawCash(double amount) {
        if (amount > 0 && amount <= availableBalance) {
            availableBalance -= amount;
            System.out.println("Withdrawal Successful. Remaining Balance: $" + availableBalance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void depositCash(double amount) {
        if (amount > 0) {
            availableBalance += amount;
            System.out.println("Deposit Successful. New Balance: $" + availableBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMainMenu();
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    withdrawCash(withdrawalAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    depositCash(depositAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void main(String[] args) {
        Atm atm = new Atm(1000.0);
        atm.run();
    }
}

