import java.util.Scanner;

public class ATM2 {
    private Bankaccount userAccount;

    public ATM2(Bankaccount userAccount) {
        this.userAccount = userAccount;
    }

    public double checkBalance() {
        return userAccount.getBalance();
    }

    public void deposit(double amount) {
        userAccount.deposit(amount);
    }

    public void withdraw(double amount) {
        userAccount.withdraw(amount);
    }

    public static void main(String[] args) {
       try( Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter initial balance for your bank account: ");
        double initialBalance = scanner.nextDouble();

        Bankaccount userAccount = new Bankaccount(initialBalance);

        ATM2 atm = new ATM2(userAccount);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: $" + atm.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
}
