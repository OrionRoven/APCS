// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs
 public class PowerN {
   public static int powerN (int base, int n) {
     if (n == 1) {
       return base;
     }
     return base * powerN(base, n - 1);
   }
   public static void main(String[] args) {
     System.out.println(powerN(3,1));
     System.out.println(powerN(3,2));
     System.out.println(powerN(3,3));

   }
 }
