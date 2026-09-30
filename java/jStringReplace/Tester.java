public class Tester {
	public static void main(String[] args) {
		String text = "Hello World!";
		String ch = ""+text.charAt(text.length() - 2);
		System.out.println(text.replace(ch, "A"));
		System.out.println(text);
		text = text.replace(ch, "A");
		System.out.println(text);
	}
}