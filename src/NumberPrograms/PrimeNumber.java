package NumberPrograms;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 6;
        System.out.println(isPrime(num));

  }


  public static boolean isPrime(int num) {
      for (int i = 2; i < num; i++) {
          if (num % i == 0) {
              return false;
          }
      }
      return true;
  }
}
