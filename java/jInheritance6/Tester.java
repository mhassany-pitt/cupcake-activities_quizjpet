public class Tester {

   public static void main(String[] args) { 

      Animal creature = new Animal(10, 1);
      Animal dog = new Dog(10, 4);
      Animal boy1 = new Man(10, 2, 50);
      Animal boy2 = new Man(10, 2, 50);
		
      int result = 0;
		
      if (creature.equals(dog))
         result = 1;
      else
         result = 1*2;
		
      if(dog.equals(boy1))
         result = result + 1*10;
      else
         result = result + 1*20;
		
      if (boy1.equals(boy2))
         result = result + 1*100;
      else
         result = result + 1*200;           
                   
       System.out.println(result);
    }
}