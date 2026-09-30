public class Tester {
  public static void main(String[] args) {

          String s1 = new String("hello");
          String s2 = new String("hello");
          int result = 8;
          if (s1==s2)
              result++;
          if (s1.equals(s2))
              result--;
      
      System.out.println(result);
    }
}