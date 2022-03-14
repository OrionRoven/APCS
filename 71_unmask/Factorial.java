// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: All of them took <5 minutes

public class Factorial {
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    else {
      return n * factorial(n-1);
    }
  }
  public static void main(String[] args) {
    System.out.println(factorial(1));
    System.out.println(factorial(2));
    System.out.println(factorial(3));

  }
}
