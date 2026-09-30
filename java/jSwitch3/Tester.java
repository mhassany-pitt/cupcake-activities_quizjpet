public class Tester {
  public static void main(String[] args) {

       int result = 5;
       int a = 3 ;

       switch (a) {
           case 1:
                  result = a;
                  break;
           case 2:
                  result = a+1;
                  break;
           case 3:
                  result = a * a;
                  break;
           default:
                  result = 0;
       }
       
      System.out.println(result);
    }
}