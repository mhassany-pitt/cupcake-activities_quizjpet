public class Tester {
  public static void main(String[] args) {

        int i = 0;
        int result = 0;
        while ( i < 8 ) {
	    if (i > 2) 
	       result = 1;
            if (i < 7)
               result = 2;
            i++;
        }
          
      System.out.println(result);
    }
}