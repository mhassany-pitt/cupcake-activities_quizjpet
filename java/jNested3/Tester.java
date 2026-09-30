public class Tester {
  public static void main(String[] args) { 
       double result = 0;
       double totalBalance = 0;
       for(int i = 1; i < 4; i++){
          BankAccount account = new BankAccount();
          for(int j = 0; j < 6 ; j++){
               account.deposit(i * 100.0);
          }
          totalBalance += account.getBalance();
        }
        result = totalBalance;         
      System.out.println(result);
    } 
}