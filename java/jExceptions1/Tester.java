public class Tester {
   public static void main(String[] args) { 	
      int i = -6 + 8;
      int j = 2 - 8;
		
      SimpleMath math = new SimpleMath(i, j);
      System.out.println(math.verifyArguments());
   }
}