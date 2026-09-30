public class Tester {

   public static void main(String[] args) { 
   
      int[][] data = { {0, 2, 5, 3},
                       {1 ,2, 4, 3},
                       {0, 7, 3, 0},
                       {0, 3, 2, 9} };
      int result = 0;

      for (int i=0 ; i < data.length ; i++) 
         for (int j=0 ; j < data.length ; j++) 
            if (data[i][j] > 3)
               result++;
       System.out.println(result);
    } 
}