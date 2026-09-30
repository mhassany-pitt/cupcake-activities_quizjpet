public class Tester {
  public static void main(String[] args) {
       CashRegister register = new CashRegister();
       register.recordPurchase(0.75);
       register.recordPurchase(2.50);
       register.enterPayment(15, 0, 5, 0, 0);
       double result = register.giveChange();    
      System.out.println(result);
    }
}