public class Tester {
   public static void main(String[] args) { 

      int result = 10;
      int j = 4;

      if (j < 11)
          result = result - j; 
      if (j > 6)
          result = result + 5 - j; 
      if (j > 3)
          result = result + j; 
      

      System.out.println(result);
    } 
}