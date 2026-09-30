import java.util.ArrayList;

public class Tester {

   public static void main(String[] args) { 

      ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
      
      accounts.add(new BankAccount(101, 300.0));
      accounts.add(new BankAccount(102, 500.0));
      accounts.add(new BankAccount(103, 600.0));
      accounts.add(new BankAccount(104, 100.0));
      accounts.add(new BankAccount(105, 0.0));
      accounts.add(new BankAccount(106, 700.0));
      accounts.add(new BankAccount(107, 400.0));
      accounts.add(new BankAccount(108, 200.0));
      accounts.add(new BankAccount(109, 500.0));
      accounts.add(new BankAccount(110, 200.0));
      
      double atLeast = 6 * 100.0;
      int result = 0;

      for (BankAccount a : accounts)
         if (a.getBalance() >= atLeast)
        	 result++; 
      
      System.out.println(result);
    }
}