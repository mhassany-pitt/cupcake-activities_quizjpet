public class Tester {
    public static void main(String[] args) { 
       
        final int VALUE = 2;
        int[] numbers = new int[2]; 
	int j = 3;

        numbers[0] = VALUE + j;
        numbers[1] = VALUE + j - 1;
          
        System.out.print(numbers[0]);
        System.out.print(numbers[1]);
          
    }
}