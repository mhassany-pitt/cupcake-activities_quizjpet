public class Tester {
  public static void main(String[] args) {

      BankAccount account = new BankAccount(500.0);
      double increase = 100.0;
      int years = 10;
      int i = 0;
      
      do {
            account.deposit(increase);
            i++;
      } while (i < years);
     
      double result = account.getBalance();  
      System.out.println(result);
    }
}