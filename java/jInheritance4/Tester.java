import java.util.ArrayList;

public class Tester {

   public static void main(String[] args) { 

      ArrayList<Animal> zoo = new ArrayList<Animal>();
		
      zoo.add(new Animal(25, 2));
      zoo.add(new Man(5, 2, 25));
      zoo.add(new Dog(2, 4));
      zoo.add(new Man (60, 2, 150));
		
      System.out.println(zoo.get(2).speak());
   } 
}