import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<Double>();

        list.add(1.1);

        list.add(2.2);

        list.add(3.3);

        list.remove(1);

        for(Double d : list)

            System.out.println(d);

    }

}