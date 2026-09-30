public class Tester {
    public static void main(String[] args) {      

        double[] price = {1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5};
        CashRegister register = new CashRegister();
       
        for (int i = 0; i < price.length; i++)
             register.recordPurchase(price[i]);
        register.enterPayment(50, 0, 0, 0, 0);

        double result = register.giveChange();
        System.out.println(result);
    } 
}