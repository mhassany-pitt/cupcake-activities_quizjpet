public class Tester {
   public static void main(String[] args) { 

      int array[] = {1, 2, 3, 4, 5, 6};
      for(int i = 3 ; i < array.length ; i++)
            System.out.print(array[i]);     
      System.out.println();

      array = new int[3];
      for(int i = 0 ; i < array.length ; i++){
           array[i] = i;
           System.out.print(array[i]);    
      } 

  } 
}