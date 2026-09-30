public class Tester {
  public static void main(String[] args) { 

       int result = 0;
       int j = 0;
       for(int i = 0; i < 2; i++) {
           for(j = 0; j < i; j++)
               System.out.print(j);  
           System.out.println();
        }
        result += j;
        System.out.print(result);

  }
}