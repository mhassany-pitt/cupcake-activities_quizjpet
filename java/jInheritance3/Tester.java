public class Tester {

   public static void main(String[] args) { 

      Animal weirdThing = new Animal(100, 7);
      Animal happyWolfy = new Dog(7, 4);
      Animal poorSparky = new Dog (15, 3);
		
      System.out.println(weirdThing.computeSpeed());
      System.out.println(happyWolfy.computeSpeed());
      System.out.println(poorSparky.computeSpeed());
   }
}