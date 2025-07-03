package leetcode.tasks;

public class _0053_MaximumSubarray {

    /**
     * Brute Force Solution
     * Time Complexity O(n²)
     * Space Complexity O(1)
     */
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) throw new IllegalArgumentException();
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                maxSum = Math.max(maxSum, currentSum += nums[j]);
            }
        }
        return maxSum;
    }

    /**
     * Optimal Solution Kadane’s Algorithm
     * Time Complexity O(n)
     * Space Complexity O(1)
     */
    public static int maxSubArrayOptimal(int[] nums) {
        if (nums.length == 0) throw new IllegalArgumentException();
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
