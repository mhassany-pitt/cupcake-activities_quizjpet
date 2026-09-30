public class Tester {
   
   public static int[] shiftAndPlaceMax(int[] arr) {
       int max = arr[0];
       int maxIndex = 0;
       
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
               maxIndex = i;
           }
       }

       for (int i = arr.length - 1; i > 0; i--) {
           arr[i] = arr[i - 1];
       }

       arr[0] = max;
       return arr;
   }

   public static void print(int[] array) {
       for (int x : array) {
           System.out.print(x + " ");
       }
       System.out.println();
   }

   public static void main(String[] args) {
       int[] values = { 7, 2, 9, 8, 8 };
       System.out.println("Modified Array:");
       print(shiftAndPlaceMax(values));
   }
}