public class sameStarChar {
  public static boolean sameStarChar(String str) {
    boolean truth=false;
    if (str=="" || str=="*" || str=="**" || str.indexOf("*")==-1) {
      return true;
    }
    for (int i=1; i<str.length()-1; i++) {
      if (str.substring(i,i+1).equals("*")) {
        if (str.charAt(i-1)==str.charAt(i+1)) {
          truth=true;
        } else {
          truth=false;
        }
      }
    }
    return truth;
  }

  public static void main(String[] args) {
    System.out.println(sameStarChar("xy*yzz"));
  }
}
