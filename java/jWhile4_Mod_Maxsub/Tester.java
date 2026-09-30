public class Tester {
  public static void main(String[] args) {

        int i = 0;
        int result = 3;
   
        while ( i < 2 ) {
            result++;
            i++;
        } 

        if (i % 2 == 0)
            result++;

      System.out.println(result);
    }
}