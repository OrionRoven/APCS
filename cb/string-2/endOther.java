public class endOther {
  public static boolean endOther(String a, String b) {
    a=a.toLowerCase();
    b=b.toLowerCase();
    if (a.length()<b.length()) {
      String endB = b.substring(b.length()-a.length(),b.length());
      if (endB.equals(a)) {
        return true;
      }
    } else if (a.length()>b.length()) {
      String endA = a.substring(a.length()-b.length(),a.length());
      if (endA.equals(b)) {
        return true;
      }
    } else if (a.length()==b.length()) {
      if (a==b) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(endOther("nana", "baNANA"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("AbC", "Hiamc"));
    System.out.println(endOther("abc", "abc"));
  }
}
