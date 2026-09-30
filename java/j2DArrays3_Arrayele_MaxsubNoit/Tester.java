public class Tester {
     public static void main(String[] args) { 
       
      final int VALUE = 4;
      int result = 0;
      int[] numbers = new int[2];
      int j = 3; 

      for(int i = 0; i < 2; i++)
          result = j - i;

      numbers[0] = VALUE + result;
      numbers[1] = VALUE + result - 1;
      
      System.out.print(numbers[0]);
      System.out.print(numbers[1]);

   }
}