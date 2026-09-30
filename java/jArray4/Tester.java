public class Tester {
  public static void main(String[] args) {     

       int[] numbers = new int[10];
       for (int i = 0; i < numbers.length; i++)
            numbers[i] = i * i;
       int result = numbers[2];
        
      System.out.println(result);
    }
}