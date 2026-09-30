public class Tester
{
	public static void main(String[] args)
	{
		String str1 = "Hello World!";
		int x = 5;
		if (x < 10)
			str1 = null;
		System.out.println(str1 == "");
		System.out.println(str1 == null);		
    }
}