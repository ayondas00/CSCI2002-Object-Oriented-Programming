package JavaProject;
public class BankAccount {
   private String accountHolder;
   private double balance;
   public BankAccount(String accountHolder, double balance) {
       this.accountHolder = accountHolder;
       if (balance >= 0) {
           this.balance = balance;
       }
   }
   public void deposit(double amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println(amount + " deposited.");
       }
   }
   public void withdraw(double amount) {
       if (amount > 0 && amount <= balance) {
           balance -= amount;
           System.out.println(amount + " withdrawn.");
       } else {
           System.out.println("Invalid withdrawal.");
       }
   }
   public double getBalance() {
       return balance;
   }
   public String getAccountHolder() {
       return accountHolder;
   }
   public static void main(String[] args) {
       BankAccount account =
               new BankAccount("Rahim", 5000);
       account.deposit(5000);
       account.withdraw(2000);
       System.out.println(
               "Account Holder Name: "
               + account.getAccountHolder()
       );
       System.out.println(
               "Current Balance: "
               + account.getBalance()
       );
   }
}
