public class Tester {
   public static void main(String[] args) {

      BankAccount myBankAccount = new BankAccount(23.0);
      if ( myBankAccount.getBalance() > 50 ) {
         myBankAccount.withdraw(50);
      }
      else {
         myBankAccount.deposit(50);
      }

      double result = myBankAccount.getBalance();
  
      System.out.println(result);
    }
}