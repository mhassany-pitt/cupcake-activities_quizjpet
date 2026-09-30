public class Tester {
     public static void main(String[] args) { 
       
      final int VALUE = 4;
      int[] numbers = new int[2];  

      for(int i=0; i < 2; i++)
         for(int j=0; j < 3; j++)
            numbers[i] = VALUE + j - i;

      for(int i=0; i < 2; i++) {
         System.out.print(numbers[i]);
      }
   }
}