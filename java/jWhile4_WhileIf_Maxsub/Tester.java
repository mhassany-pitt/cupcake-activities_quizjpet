public class Tester {
  public static void main(String[] args) {

        int i = 0;
        int result = 0;
        while ( i < 5 ) {
            if (i == 0)
               result++;
            if (i == 3)
               result++;
            if (i == 3 * 2)
               result++;
            i++;
        }
          
      System.out.println(result);
    }
}