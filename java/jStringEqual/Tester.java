public class Tester {
	public static void main(String args[]) {
		String str1 = new String("ThIS is a TeSt");
		String str2 = new String("tHIS IS a TESt");
		String ch1 = "" + str1.charAt(12);
		String ch2 = "" + str2.charAt(12);
		System.out.println(ch1.equalsIgnoreCase(ch2));
		System.out.println(ch1.equals(ch2));
	}
}