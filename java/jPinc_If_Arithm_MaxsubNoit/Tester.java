public class Tester {
  public static void main(String[] args) {

         int result = 20;
         int j = 1; 

         j++;
         if (j < 7)
             result++;   
         if (j < 12)
             result = result - j;   

      System.out.println(result);
    }
}