public class Tester{

  public static int fib(int n) { 
    if (n <= 2){
      return 1;
    }

    int t1 = fib(n - 1);
    int t2 = fib(n - 2);

    return t1 + t2;
  } 

  public static void main(String []args){
    System.out.println(fib(3));
  }
}