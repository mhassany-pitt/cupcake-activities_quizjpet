//Entry class of the quiz, please Do not change class name 
 public class Tester{
     
  public static int f(int n) {
    if (n == 1) return 1;

    int x = f(n - 1);
    
    return n * f(n - 1);
  }

  public static void main(String []args){
     System.out.print(f(2));
  }
}