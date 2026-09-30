public class Tester {
  public static void main(String[] args) {

       final double INITIAL_BALANCE = 100;
       final double RATE = 10;

       Investment invest = new Investment(INITIAL_BALANCE, RATE);

       invest.waitForBalance( 3 * INITIAL_BALANCE );

       int result = invest.getYears();
      
      System.out.println(result);
    }
}