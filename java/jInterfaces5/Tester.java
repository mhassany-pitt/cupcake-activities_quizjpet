public class Tester {
  public static void main(String[] args) { 			

		int result = 0;
		
		double procSpeed = 3 * 0.5;
		double memCapacity = 3 * 0.5;
		
		Mechanism myComp = new Computer(procSpeed, memCapacity, false);
		Mechanism myCar = new Car("Daewoo", 3);		
		Mechanic smartGuy = new Mechanic();
		
		if (smartGuy.needRepair(myComp))
			smartGuy.repair(myComp);
		
		result += smartGuy.howMuch();
		
		if (smartGuy.needRepair(myCar))
			smartGuy.repair(myCar);
		
		result += smartGuy.howMuch();
                
      System.out.println(result);
    }
}