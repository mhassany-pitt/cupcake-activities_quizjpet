public class Tester {
     public static void main(String[] args) { 
       
      final int ROWS = 4;
      int[] numbers = new int[ROWS];  

      for(int i=0; i < ROWS; i++)
         for(int j=0; j < ROWS; j++)
            numbers[i] = 4 + j - i;

      for(int i=0; i < ROWS; i++) {
         System.out.print(numbers[i]);
      }      
   }
}