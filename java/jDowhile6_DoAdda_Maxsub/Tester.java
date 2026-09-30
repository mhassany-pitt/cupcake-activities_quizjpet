public class Tester {
  public static void main(String[] args) {

       int j = 0;
       int result = 0;
       do {
           j++;
           result += 3;
           result = result - j;
       } while (j < 3);
       
      System.out.println(result);
    }
}