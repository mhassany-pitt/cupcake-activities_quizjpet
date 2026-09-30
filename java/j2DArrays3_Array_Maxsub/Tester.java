public class Tester {
     public static void main(String[] args) { 
       
      final int VALUE = 4;
      int result = 0;
      int[] numbers = new int[2]; 
      int i, j;

      for(i=0; i < 2; i++)
         for(j=0; j < 3; j++)
            result = VALUE + j - i;

      numbers[0] = result;
      numbers[1] = result - 1;

      System.out.print(numbers[0]);
      System.out.print(numbers[1]);

   }
}