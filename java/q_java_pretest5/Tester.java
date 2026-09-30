public class Tester {

    public static void main(String[] args) {

        int[] data = new int[5];

        for (int i = 0; i < 5; i++)

            data[i] = i*i;

        data[2] += 1;

        System.out.println(data[2]);

    }

}