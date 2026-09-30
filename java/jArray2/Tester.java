public class Tester {
  public static void main(String[] args) { 

    int result = 0;
    int array[] = {1, -2, -3, 4, -5, 6, 7, 8, -9, 10, -11};
    for(int i = 4; i < array.length; i++)
      if(array[i] > 0)
        result = result + array[i];     
  
      System.out.println(result);
    } 
}