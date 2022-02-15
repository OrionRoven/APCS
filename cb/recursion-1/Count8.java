// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs
 public class Count8 {
   public static int count8 (int n) {
     if (n == 0) {
       return 0;
     }
     if (n % 10 == 8 ) {
       if ((n / 10) % 10 == 8) {
         return 2 + count8(n / 10);
       } else {
         return 1 + count8(n / 10);
       }
     } else {
       return 0 + count8(n/10);
     }
   }
   public static void main(String[] args) {
     System.out.println(count8(8));
     System.out.println(count8(818));
     System.out.println(count8(8818));

   }
 }
