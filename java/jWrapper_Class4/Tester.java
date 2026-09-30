import java.util.ArrayList;

public class Tester {

   public static void main(String[] args) { 

      ArrayList<Integer> aNumbers = new ArrayList<Integer>();
      ArrayList<Double> balances = new ArrayList<Double>();
      ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

      double result = 0.0;
      
      aNumbers.add(new Integer(101));
      aNumbers.add(new Integer(102));
      aNumbers.add(new Integer(103));
      aNumbers.add(new Integer(104));

      balances.add(new Double(140.0));
      balances.add(new Double(204.0));
      balances.add(new Double(400.0));
      balances.add(new Double(400.4));

      for (int i = 0; i < aNumbers.size(); i++)
         accounts.add(new BankAccount(aNumbers.get(i), balances.get(i)));
      
      for (BankAccount ba : accounts)
         result += ba.getBalance();          

      System.out.println(result);
    }
}