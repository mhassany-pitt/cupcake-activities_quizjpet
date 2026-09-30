import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {    

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int result = 0;

        for (int i = 1; i <= 5; i++)
            numbers.add(i * 2);

        numbers.remove(2);
        numbers.set(2, 100);

        result = numbers.get(3);
        System.out.println(result);
    }
}