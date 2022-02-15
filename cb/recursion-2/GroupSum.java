// Standard Valentine Configuration: Orion Roven, Max Schneider
// APCS period 8
// 2022-2-15
// time elapsed: _hrs
 public class GroupSum {
   public boolean groupSum(int start, int[] nums, int target) {
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
 }
