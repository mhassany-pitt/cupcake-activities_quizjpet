public class Tester {
   public static void main(String[] args) { 			
      int i = 5 - 0;
      int j = 0 ;
		
      SimpleMath math = new SimpleMath(i, j);
      System.out.println(math.reportPower());
   }
}