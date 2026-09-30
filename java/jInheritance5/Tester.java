public class Tester {

   public static void main(String[] args) { 
	
      Animal it = new Animal(1000, 14);
		
      Animal doggy = new Dog(14, 4);
		
      Animal billy = new Man(14*5, 2, 100);
		
      System.out.println(it);
      System.out.println(doggy);
      System.out.println(billy);
   }
}