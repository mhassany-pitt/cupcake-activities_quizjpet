public class Tester {
  public static void main(String[] args) { 

    int[] array = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
    int result = array[1];
    int j = 1; 
    
    while (j < 10) {
      result += j;
      j++;
    }
        
      System.out.println(result);
    }
}