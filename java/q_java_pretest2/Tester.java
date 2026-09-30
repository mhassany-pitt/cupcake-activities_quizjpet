public class Tester {

    public static void main(String[] args) {

        int myYear = 2012;

        String myText = new String("Hello, IS17!");

        int result = 0;

        if (myText.length() > 10) {

            result = 1;

            if (myText.length() < 30 && myYear >= 2012)

                result += 5;

        }

        else

            if (myYear >= 2000)

                result += 10;

            else

                result += 100;

        System.out.println(result);
    }

}