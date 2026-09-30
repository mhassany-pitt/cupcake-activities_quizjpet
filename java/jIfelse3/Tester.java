public class Tester {
   public static void main(String[] args) {

      BankAccount myBankAccount = new BankAccount(39.0);

      if ( myBankAccount.getBalance() > 50 ) 
         myBankAccount.withdraw(50);
      else if ( myBankAccount.getBalance() > 30 )
         myBankAccount.withdraw(30); 
      else
         myBankAccount.deposit(30); 
 
     double result = myBankAccount.getBalance();
  
      System.out.println(result);
    }
}