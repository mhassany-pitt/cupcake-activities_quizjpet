public class Tester {

   public static void main(String[] args) {    

      int[][] multiD = { {1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {15, 16, 17, 18} };
      int a = multiD[2][2];
      int b = multiD[2][3];
      int result = a + b ;
      System.out.println(result);
    }
}