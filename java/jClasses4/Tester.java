public class Tester {
  public static void main(String[] args) {

       CashRegister register = new CashRegister();
       register.recordPurchase(15);
       register.enterPayment(50.5);
       double result = register.giveChange();  
   
      System.out.println(result);
    }
}