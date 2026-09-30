public class Tester {
  public static void main(String[] args) { 	

		int result = 1;
		
		Mechanism mech = new Computer(1.0, 1.0, false);
		result += mech.reportProblems();
		
		mech = new  Car("Daewoo", 2);
		result += mech.reportProblems();
               
      System.out.println(result);
    }
}