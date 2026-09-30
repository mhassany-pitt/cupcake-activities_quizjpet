public class Tester {
   public static void main(String[] args) { 

      int result = 0;
      int i;
      for(i = 0; i < 2; i++)
         result = i;    
      if (result > 5)
         result = result + 1; 

      System.out.println(result);
    } 
}