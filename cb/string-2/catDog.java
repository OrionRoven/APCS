public class catDog {
  public static boolean catDog(String str) {
    int cats=0;
    int dogs=0;
    for (int i=0; i<str.length()-2; i++) {
      if (str.substring(i,i+3).equals("cat")) {
        cats++;
      }
      if (str.substring(i,i+3).equals("dog")) {
        dogs++;
      }
    }
    if (cats==dogs) {
      return true;
    }
    return false;
  }

  public static void main(String[] args){
    System.out.println(catDog("catdog"));
    System.out.println(catDog("catcat"));
    System.out.println(catDog("1cat1cadodog"));
  }
}
