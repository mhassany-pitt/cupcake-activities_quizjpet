import java.util.ArrayList;
public class Tester {
  public static void main(String[] args) {    

        ArrayList<String> letters = new ArrayList<String>();
        int result = 0;
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        if (2 % 3 == 0)
            letters.add(3, "F");
        else if  (2 % 2 == 0)
            letters.remove(3);  	
        else 
            letters.set(3, "F");

        result = letters.size();         
      System.out.println(result);
    }
}