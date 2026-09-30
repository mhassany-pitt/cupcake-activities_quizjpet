public class Tester {
  public static void main(String[] args) {

        int i = 0;
        int result = 3;

        while ( i < 5 ) {
            result++;
            i++;
        }
        if (i == 2)
           result++;
        if (i == 4)
           result++;

      System.out.println(result);
    }
}