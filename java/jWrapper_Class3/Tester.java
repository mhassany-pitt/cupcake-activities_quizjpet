import java.util.ArrayList;

public class Tester {

   public static void main(String[] args) { 

      double sum = 0.0;
      ArrayList<Double> numbers = new ArrayList<Double>();

      numbers.add(new Double(1.1));
      numbers.add(new Double(2.2));
      numbers.add(new Double(3.3));
      numbers.add(new Double(4.4));

      for (double d : numbers)
         sum += d;         
      
      double result = sum * 8;
      System.out.println(result);
    }
}