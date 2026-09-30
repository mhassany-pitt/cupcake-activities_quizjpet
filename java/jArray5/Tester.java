public class Tester {

   public static void main(String[] args) {       

      BankAccount[] accounts = new BankAccount[10];
      
      for(int i = 0; i < accounts.length; i++)
         accounts[i] = new BankAccount(100.0 * i);                

      double result = accounts[6].getBalance();
        
      System.out.println(result);
    } 
}