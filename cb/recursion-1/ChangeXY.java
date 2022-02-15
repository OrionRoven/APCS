// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs


public class ChangeXY {
  public static String changeXY (String str) {
    if (str.length() == 0) {
      return "";
    }
    String first = str.substring(0,1);
    if (first.equals("x")) {
      first = "y";
    }
    return first + changeXY(str.substring(1));
  }
}
