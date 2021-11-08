public class xyBalance {
  public static boolean xyBalance (String str) {
    if (str.lastIndexOf("x")<=str.lastIndexOf("y")) {
      return true;
    }
    return false;
  }
  public static void main (String[] args) {
    System.out.println(xyBalance("aaxbby"));
    System.out.println(xyBalance("aaxbb"));
    System.out.println(xyBalance("yaaxbb"));
  }
}
