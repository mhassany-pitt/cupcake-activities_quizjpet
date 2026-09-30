import java.util.ArrayList;

public class Tester {
   
   public static void main(String[] args) {    

      ArrayList<String> numbers = new ArrayList<String>();
      int result = 0;

      for (int i = 0; i < 5; i++)
         numbers.add("number" + i);

      System.out.println(numbers.size());
      System.out.println(numbers.get(2));         
  }
}