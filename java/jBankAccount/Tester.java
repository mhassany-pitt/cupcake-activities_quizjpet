public class Tester {
  public static void main(String[] args) { 

       BankAccount myBankAccount = new BankAccount();
       myBankAccount.deposit(500);
       myBankAccount.withdraw(184);
       double result = myBankAccount.getBalance(); 
       
      System.out.println(result);
    }
}