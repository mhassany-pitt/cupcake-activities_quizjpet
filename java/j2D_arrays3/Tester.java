public class Tester {

   public static void main(String[] args) { 
       
      final int ROWS = 2;
      final int COLUMNS = 3;
      int[][] numbers = new int[ROWS][COLUMNS];  

      for(int i=0; i < ROWS; i++)
         for(int j=0; j < COLUMNS; j++)
            numbers[i][j] = 2 + j - i;

      for(int i=0; i < ROWS; i++) {
         for(int j=0; j < COLUMNS; j++)
            System.out.print(numbers[i][j]);
         System.out.println();
      }      
   }
}