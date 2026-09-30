public class Tester {
  public static void main(String[] args) {

       int j = 9;
       int result = 10;

       j++;
       if (j < 6)
          result += 1;
       if (j < 11){
          result += 2;
          result = result - j;
       }
       
      System.out.println(result);
    }
}