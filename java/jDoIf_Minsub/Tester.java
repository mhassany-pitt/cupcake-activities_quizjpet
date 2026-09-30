public class Tester {
  public static void main(String[] args) {

         int result = 0;
         int i = 0;
         
         do {
             i++;
             if (i > 2)
		result = 1;
             if (i < 7)
		result = 2;
         } while (i < 7);
 
      System.out.println(result);
    }
}