public class Tester {
  public static void main(String[] args) { 

       final double INITIAL_BALANCE = 100;
       final double RATE = 10;
       final int YEARS = 1;

       Investment invest = new Investment(INITIAL_BALANCE, RATE);

       invest.waitYears(YEARS);

       double result = invest.getBalance();
       
      System.out.println(result);
    }
}