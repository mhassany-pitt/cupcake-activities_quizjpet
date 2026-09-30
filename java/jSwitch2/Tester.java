public class Tester {
  public static void main(String[] args) {

        int month = 1;
        int result = 0;
        switch (month) {
            case 1:
            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 2:
                result = 28;
                break;
        }
  
      System.out.println(result);
    }
}