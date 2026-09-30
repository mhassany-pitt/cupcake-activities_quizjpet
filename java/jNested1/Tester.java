public class Tester {
  public static void main(String[] args) { 

        int result = 0;
        for ( int j = 1; j <= 7;  j++ ) {
            for ( int k = 1;  k <= 7 ;  k++ ) {
                       result = j * k;  
            }
         }
        
      System.out.println(result);
    }
}