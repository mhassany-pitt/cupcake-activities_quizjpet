public class Tester {
  public static void main(String[] args) { 

    int result = 0;
    int array[] = {1, -2, -3, 4, -5, 6, 7, 8, -9, 10, -11};
    int i;
    for(i = 0; i < 6; i++)
      result = i;   
    if(array[i] > 0)
      result = result + 1;  
      System.out.println(result);
    } 
}