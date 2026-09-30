public class Tester {
   public static void main(String[] args) { 	
      Person me;
      try {
         String name;
         int age = 50 - 67;
         me = new Person ("John", age);
         System.out.println(me.getName() + " is a nice person");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}