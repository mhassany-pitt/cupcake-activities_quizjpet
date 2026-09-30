public class Tester {
   public static void main(String[] args) { 			
      int i = 5 - 7;
      int j = 2;
		
      SimpleMath math = new SimpleMath(i, j);
      System.out.println(math.reportSubtract());
   }		
}