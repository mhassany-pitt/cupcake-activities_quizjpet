public class Tester {
  public static void main(String[] args) {

	int result = 0;
	int i = 0;
         
	do {
	    i++;
	    result = 1;
	    if(i % 2 == 0)
	        result = 2;
	} while (i < 5);

	while (i > 0) {
	    i--; 
            if (i % 3 == 0)
                result = 3;
	}

 
      System.out.println(result);
    }
}