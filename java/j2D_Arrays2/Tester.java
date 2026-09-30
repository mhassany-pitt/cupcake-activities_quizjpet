public class Tester {

   public static void main(String[] args) {      

      int[][] array = new int[4][4];

      for (int i = 0; i < array.length ; i++)
         for ( int j = 0 ; j < array.length ; j++)
            array[i][j] = i + j;

      int result = array[1+1][1-1] ;
      System.out.println(result);
    }
}