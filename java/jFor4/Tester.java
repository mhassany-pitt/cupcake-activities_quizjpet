public class Tester {
  public static void main(String[] args) {
      double result = 0;
      BankAccount account = new BankAccount (1000.0);
      for (int i = 0; i < 4 ; i++) {
           account.withdraw(50.0);
           result = account.getBalance();
      }     
      System.out.println(result);
    }
}