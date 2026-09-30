public class Tester {
  public static void main(String[] args) {

         int result = 5;
         int i = 0;
         
         do {
             i++;
         } while (i < 5);
         if(i % 2 == 0)
	     result += 1;

	 while (i > 6) {
             i--;
             result += 1;
	 } 
         if(i % 3 == 0)
	     result += 1;      
 
      System.out.println(result);
    }
}