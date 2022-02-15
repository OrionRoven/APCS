// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs


public class Count7 {
  public static int count7 (int n) {
    int ctr = 0;
    if (n%10 == 7) ctr++;
    if (n < 10) return ctr;
    return ctr + count7(n/10);
  }

  public static void main(String[] args) {
    System.out.println(count7(717));
    System.out.println(count7(7));
    System.out.println(count7(123));
    System.out.println(count7(771777119));
  }
}
