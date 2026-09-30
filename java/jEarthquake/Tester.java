public class Tester {
	public static void main(String[] args) {
		String r;
		double richter = 7.0;
		if (richter <= 0.0)
			r = "Negative numbers are not valid";
		else if (richter < 3.5)
			r = "Generally not felt by people";
		else if (richter < 4.5)
			r = "Felt by many people, no destruction";
		else if (richter < 6.0)
			r = "Damage to poorly constructed buildings";
		else if (richter < 7.0)
			r = "Many buildings considerably damaged, some collapse";
		else if (richter < 8.0)
			r = "Many buildings destroyed";
		else 
			r = "Most structures fall";
		System.out.println(r);
	}
}