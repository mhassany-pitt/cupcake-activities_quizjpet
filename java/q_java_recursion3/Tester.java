public class Tester{
  private static void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }

  public static void rev(int[] A, int low, int high) {
    if (low < high) {
      swap(A, low, high);
      rev(A, low + 1, high - 1);
    }
  }

  public static void main(String[] args){
    int[] A = { 5, 5, 0 };
    rev(A, 0, A.length - 1);
    int result = A[0];
      System.out.println(result);
    }
}