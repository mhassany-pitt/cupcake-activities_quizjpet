public class Tester {
  public static void main(String[] args) { 			

		Mechanism car = new Car("Daewoo", 1);
		Mechanic pepBoys = new Mechanic();
		
		if (pepBoys.needRepair(car))
			pepBoys.repair(car);
		
		int result = pepBoys.howMuch();
                
      System.out.println(result);
    }
}