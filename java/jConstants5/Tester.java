public class Tester {
  public static void main(String[] args) {   

      CashRegister register = new CashRegister();

      register.recordPurchase(2.1);
      register.enterPayment(5, 1, 0, 0, 0);

      double result = register.giveChange();   
       
      System.out.println(result);
    }
}