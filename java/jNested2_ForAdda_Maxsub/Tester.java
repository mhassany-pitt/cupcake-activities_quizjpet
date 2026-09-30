public class Tester {
  public static void main(String[] args) { 
       int result = 0;
       for(int i = 0; i < 6; i++){
           for(int j = 0; j < 6; j++){
               result = j;  
               result += 1;
           }
       }
      System.out.println(result);
    }
}