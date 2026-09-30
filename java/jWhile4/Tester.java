public class Tester {
  public static void main(String[] args) {

        int i = 0;
        int result = 0;
        while ( i < 10 ) {
            if (i % 4 == 0)
               result++;
            i++;
        }
          
      System.out.println(result);
    }
}