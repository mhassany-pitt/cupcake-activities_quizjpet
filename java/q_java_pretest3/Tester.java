public class Tester {

    public static void main(String[] args) {

        Rectangle myBox = new Rectangle(50, 40, 10, 10);

        myBox.magnify(6);

        System.out.println(myBox.getHeight());

        System.out.println(myBox.getWidth());

    }

}