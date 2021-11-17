/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
You may assume that the array is length 3 or more.
*/
public class centeredAverage {
  public static int centeredAverage(int[] nums) {
    int average = 0;
    int max = 0;
    int min = 100;
    int minCtr = 0;
    int maxCtr = 0;
    for(int i=0; i<nums.length; i++) {
      max = Math.max(nums[i], max);
      min = Math.min(nums[i], min);
    }
    for()
  }
}
