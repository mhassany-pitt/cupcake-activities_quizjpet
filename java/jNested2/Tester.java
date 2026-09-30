public class Tester {
  public static void main(String[] args) { 

        int result = 0;
        for(int i = 0; i < 5; i++) {
	    for(int j = 0; j < i; j++)
	        result += j;         
        }

      System.out.println(result);
    }
}