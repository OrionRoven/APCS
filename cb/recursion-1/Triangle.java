// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs

public class Triangle {
  public static int triangle (int rows) {
    if (rows == 0) return 0;
    if (rows == 1) return 1;
    return triangle(rows-1) + rows;
  }

  public static void main(String[] args) {
    System.out.println(triangle(1));
    System.out.println(triangle(2));
    System.out.println(triangle(3));
    System.out.println(triangle(4));
  }
}
