public class Tester {
  public static void main(String[] args) {

       int j = 0;
       int result = 0;
       do {
           j++;
           result += 5 - j;
       } while (j < 5);
       
      System.out.println(result);
    }
}