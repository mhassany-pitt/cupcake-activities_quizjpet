public class Tester {

   public static void main(String[] args) { 
      
      Animal it = new Animal(218, 5);	
      Animal doggy = new Dog(10, 4);
      Animal billy = new Man(50, 2, 218);

      System.out.println(it.getAge());
      System.out.println(doggy.getAge());
      System.out.println(billy.getAge());
      System.out.println(((Man)billy).getWeight());
   }
}