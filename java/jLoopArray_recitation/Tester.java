public class Tester {
   public static int[] rotate(int[] arr) {
       int first = arr[0];
       for (int i = 0; i < arr.length - 1; i++) {
           arr[i] = arr[i + 1];
       }
       arr[arr.length - 1] = first;
       return arr;
   }

   public static void print(int[] array) {
       for (int x : array) {
           System.out.print(x + " ");
       }
       System.out.println();
   }

   public static void main(String[] args) {
       int[] values = { 11, 8, 9, 8, 11, 5 };
       System.out.println("Modified Array:");
       print(rotate(values));
   }
}