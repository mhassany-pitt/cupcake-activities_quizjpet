class Tester {
  public static void main(String[] args) {
    int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    int index = 5;
    for (int t: primes) {
      if (index < t)
         System.out.println(t); 
    }
  }
}