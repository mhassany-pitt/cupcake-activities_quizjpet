public class Tester{
  public static void main(String []args){
    
    int diffs[] = {1, -0, -3, 4, -11};
    
    diffs[1] = diffs[1] * -1;
    diffs[2] = diffs[2] * -1;
    diffs[4] = diffs[4] * -1;
    
    int result = diffs[1];
      System.out.println(result);
    }
}