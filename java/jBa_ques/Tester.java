public class Tester {
  public static void main(String[] args) {

        BankAccount myBankAccount1 = new BankAccount();
        myBankAccount1.deposit(7 * 100);
        BankAccount myBankAccount2 = new BankAccount(2000.0);
        double result = myBankAccount1.getBalance() + myBankAccount2.getBalance();
           
      System.out.println(result);
    }
}