public class Tester {

   public static void main(String[] args) { 

      Animal it = new Animal(1000, 5);	
      Animal doggy = new Dog(10, 4);
      Animal boy = new Man(5, 2, 25);	
      Animal granny = new Man (60, 2, 150);
		
      int i = 4;

      if (i < 1)
         System.out.println(it.speak());
      else if (i < 2)
         System.out.println(doggy.speak());
      else if (i < 3)
         System.out.println(boy.speak());
      else 
         System.out.println(granny.speak());
   }
}