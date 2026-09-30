public class Tester {
  public static void main(String[] args) { 			

		double procSpeed = 3 * 0.5;
		double memCapacity = 3 * 0.5;
		
		Mechanism comp = new Computer(procSpeed, memCapacity, false);
		Mechanic pcFixer = new Mechanic();
		
		if (pcFixer.needRepair(comp))
			pcFixer.repair(comp);
		
		int result = pcFixer.howMuch();
                
      System.out.println(result);
    }
}