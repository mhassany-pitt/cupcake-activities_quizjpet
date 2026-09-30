public class Tester {
     public static void main(String[] args) { 
       
      final int VALUE = 1;
      int[][] numbers = new int[2][3];  

      for(int i=0; i < 2; i++)
         for(int j=0; j < 3; j++)
            numbers[i][j] = VALUE + j - i;

      for(int i=0; i < 2; i++) {
         for(int j=0; j < 3; j++)
            System.out.print(numbers[i][j]);
         System.out.println();
      }      
   }
}