package leetcode.tasks;

public class _0643_MaximumAverageSubarray {

    /**
     * Sliding Window Technique Solution.
     * As the window slides forward by one element, the leftmost value is subtracted and the next value is added.
     * Time Complexity: O(n) — traverses the array once
     * Space Complexity: O(1) — uses constant extra space
     */
    public static double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }
}
