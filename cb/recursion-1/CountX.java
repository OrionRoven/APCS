// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs

public class CountX {
  public static int countX(String str) {
    if (str.length() == 0) {
      return 0;
    }
    if(str.substring(0,1).equals( "x")) {
      return 1 + countX(str.substring(1));
    } else {
      return countX(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(countX("xxhixx"));
    System.out.println(countX("xhixhix"));
    System.out.println(countX("hi"));
  }
}
