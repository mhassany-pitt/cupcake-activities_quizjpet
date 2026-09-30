public class Tester {
   public static void main(String[] args) {      

      int[] array = new int[5];
      array[0] = 2;
      int i = 1 - 1;
      int j = 1;
      array[i] = j;
      array[j] = i;
      array[4] = 9;

      System.out.print(array[i]);
      System.out.print(array[j]);
      System.out.print(array[0]);
      System.out.print(array[4]);
  }
}