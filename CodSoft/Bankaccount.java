public class Bankaccount {
  private double balance;

  public Bankaccount(double initialBalance) {
      this.balance = initialBalance;
  }

  public double getBalance() {
      return balance;
  }

  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
          System.out.println("Deposit successful. New balance: " + balance);
      } else {
          System.out.println("Invalid deposit amount.");
      }
  }

  public void withdraw(double amount) {
      if (amount > 0 && amount <= balance) {
          balance -= amount;
          System.out.println("Withdrawal successful. New balance: " + balance);
      } else {
          System.out.println("Invalid withdrawal amount or insufficient funds.");
      }
  }

  public static void main(String[] args) {
      Bankaccount userAccount = new Bankaccount(1000.0);
      System.out.println("Initial balance: $" + userAccount.getBalance());
      userAccount.deposit(200.0);
      userAccount.withdraw(500.0);
      System.out.println("Final balance: $" + userAccount.getBalance());
  }
}
