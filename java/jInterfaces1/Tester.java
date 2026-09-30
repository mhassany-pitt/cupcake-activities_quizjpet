public class Tester {
  public static void main(String[] args) { 			
		Mechanism mech1 = new Computer(4.0, 2.0, true);
		Mechanism mech2 = new Car("Honda", 4);
		
		Computer comp = (Computer) mech1;
				
		System.out.println(comp.getProcessorSpeed());		
		System.out.println(comp.reportProblems());
		
		System.out.println(((Car) mech2).getBrand());		
		System.out.println(mech2.reportProblems());
  }		
}