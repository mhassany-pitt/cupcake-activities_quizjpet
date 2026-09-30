public class Tester{
 public static void main (String[] args) {
    Account acct1 = new Account("Tina Murphy", 72354, 22);
    Account acct2 = new Account("Angelica Adams", 69713, 500.00);
    acct1.deposit (45.00); 
    acct2.deposit (75.00);
    acct1.withdraw (100.00, 2.00);
    acct2.withdraw (-100.00, 2.00); 
    acct2.addInterest();
    System.out.println (acct1.getBalance());
    System.out.println (acct2.getBalance());
  }
}