public class getSandwich {
  public static String getSandwich(String str) {
    int breadCtr=0;
    int firstBread=str.length();
    int lastBread=0;

    for (int i=0; i<str.length()-4; i++) {
      if (str.substring(i, i+5).equals("bread")) {
        breadCtr++;
        if (i<firstBread) {
          firstBread=i;
        }
        lastBread=i;
        }
      }
    if (breadCtr<2) {
      return "";
    } else {
      return str.substring(firstBread+5, lastBread);
    }
  }
  public static void main(String[] args) {
    System.out.println(getSandwich("xxbreadbreadjambreadyy"));
  }
}
