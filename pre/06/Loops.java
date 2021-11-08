public class Loops {
  public static int power(int x, int y) {
    int ans=1;
    for (int ctr=0; ctr<y; ctr++) {
      ans=ans*x;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(power(3,4));
  }
}
