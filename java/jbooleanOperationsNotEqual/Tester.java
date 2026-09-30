public class Tester {
  public static void main(String[] args) {
           int x = -10;
           String type = "positive";
           if ( Math.abs(x)  != x )
                 type = "negative";
           System.out.print( type );
  }
}