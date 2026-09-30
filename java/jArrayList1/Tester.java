import java.util.ArrayList;

public class Tester {

   public static void main(String[] args) {  

      ArrayList<BankAccount> accounts  = new ArrayList<BankAccount>();

      accounts.add(new BankAccount(1001, 500.0));
      accounts.add(new BankAccount(1002, 100.0));
      accounts.add(new BankAccount(1003, 1500.0));
      accounts.add(new BankAccount(1004, 1000.0));
      accounts.add(new BankAccount(1004, 2000.0));

      double result = accounts.get(1).getBalance();                     
      System.out.println(result);
    } 
}