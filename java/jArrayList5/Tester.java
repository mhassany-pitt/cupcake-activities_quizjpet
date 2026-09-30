import java.util.ArrayList;

public class Tester {

   public static void main(String[] args) { 

      ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
      
      for (int i = 0; i < 10; i++)
     {
         if (i % 4 == 0)
         {
        	 accounts.add(new BankAccount(100 + i, i * 100.0));
         }
     }

         for (BankAccount ba : accounts)
         {
    	     System.out.println(ba.getBalance());      
         }
     
  }
}