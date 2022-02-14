// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs

public class Fibonacci {
    public static int fibonacci (int n) {
      if (n == 0) {
        return 0;
      }
      if (n == 1) {
        return 1;
      }
      return fibonacci(n-2) + fibonacci(n-1);
    }

    public static void main(String[] args) {
      System.out.println(fibonacci(0));
      System.out.println(fibonacci(1));
      System.out.println(fibonacci(2));
    }
}
