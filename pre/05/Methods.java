public class Methods {
  public static boolean isDivisible (int n, int m) {
    if (n%m==0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isTriangle (int a, int b, int c) {
    if (a+b<c || a+c<b || b+c<a) {
      return false;
    } else {
      return true;
    }
  }

  public static int ack (int m, int n) {
    if (m==0) {
      return n+1;
    }
    if (m>0 && n==0) {
      return ack(m-1,1);
    }
    if (m>0 && n>0) {
      return ack(m-1,ack(m,n-1));
    }
    return n+1;
  }

  public static void main(String[] args) {
    System.out.println(isDivisible(8,3));
    System.out.println(isTriangle(3,4,9));
    System.out.println(ack(2,3));
  }
}
