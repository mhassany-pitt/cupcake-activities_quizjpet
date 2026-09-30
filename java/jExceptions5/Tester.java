public class Tester {
   public static void main(String[] args) { 			
      String name;
      if (47 % 2 == 0)
         name = "Jim";
      else 
         name = null;		
      try {
         int age = 30 - 47;
         Person me = new Person (name, age);
         System.out.println(me.getName() + " is a nice person");
      } catch (IllegalArgumentException e) {
         System.out.println("Bad argument");
      } catch (NullPointerException e) {
         System.out.println("Null pointer");
      }
   }		
}