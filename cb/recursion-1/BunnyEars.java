// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs

public class BunnyEars {
  public static int bunnyEars(int bunnies) {
    if (bunnies < 1) {
      return 0;
    }
    return 2 + bunnyEars(bunnies-1);
  }
  public static void main(String[] args) {
    System.out.println(bunnyEars(0));
    System.out.println(bunnyEars(1));
    System.out.println(bunnyEars(2));

  }

}
