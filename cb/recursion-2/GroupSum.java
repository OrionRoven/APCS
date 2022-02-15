// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs
 public class GroupSum {
   public static boolean groupSum(int start, int[] nums, int target) {
     if (start >= nums.length) {
       return target == 0;
     }
     if(groupSum(start + 1, nums, target - nums[start])) {
       return true;
     }
     if(groupSum(start + 1, nums, target )) {
       return true;
     }
     return false;

   }
  public static void main(String[] args) {
    int[] r = new int[3];
    r[0]=2;
    r[1]=4;
    r[2]=8;
   System.out.println(groupSum(0, r, 10));
   System.out.println(groupSum(0, r, 14));
   System.out.println(groupSum(0, r, 9));
  }
 }
