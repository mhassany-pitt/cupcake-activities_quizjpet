public class Tester {
     public static void main(String[] args) { 
       
      final int VALUE = 4;
      int[] numbers = new int[3];  

      for(int i=0; i < 2; i++)
           numbers[i] = i;
     
      int result = numbers[1] + VALUE;
      System.out.print(result);
    
   }
}