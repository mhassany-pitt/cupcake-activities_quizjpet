public class Tester {
  public static void main(String[] args) {

         boolean b = false;
         BankAccount myBankAccount = new BankAccount(179.0);

         if (myBankAccount.getBalance() > 0)
               b = true;
         if (b)
               myBankAccount.withdraw(myBankAccount.getBalance());
         else
               myBankAccount.deposit(100);

         double result = myBankAccount.getBalance();
 
      System.out.println(result);
    }
}