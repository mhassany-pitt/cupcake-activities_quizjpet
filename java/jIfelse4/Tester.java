public class Tester {
  public static void main(String[] args) {

       BankAccount myBankAccount = new BankAccount(55.0);
       if ( myBankAccount.getBalance() > 50 ) 
            if ( myBankAccount.getBalance() < 70 )
                 myBankAccount.withdraw(50);
       double result = myBankAccount.getBalance();
  
      System.out.println(result);
    }
}