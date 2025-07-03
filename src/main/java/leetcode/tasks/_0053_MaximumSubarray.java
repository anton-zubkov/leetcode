package leetcode.tasks;

/**
 * Kadane's Algorithm — an optimal solution for finding the contiguous subarray
 * with the largest sum within a one-dimensional array of integers.
 *
 * <p><strong>Practical Use Cases:</strong></p>
 * <ul>
 *   <li><b>Financial analysis</b>: Identifying the period with the highest net gain (e.g., stock price growth).</li>
 *   <li><b>Signal or audio processing</b>: Detecting the loudest segment in a waveform or stream.</li>
 *   <li><b>Genomics / Bioinformatics</b>: Locating the most significant segment in a sequence (e.g., gene expression activity).</li>
 * </ul>
 *
 * <p><strong>Algorithm Logic:</strong></p>
 * <pre>
 * For each element in the array:
 *   - Either start a new subarray from the current element,
 *   - Or extend the previous subarray by adding the current element.
 *
 * Core recurrence:
 *   currentSum = max(nums[i], currentSum + nums[i])
 *   maxSum = max(maxSum, currentSum)
 * </pre>
 *
 * <p>This approach has linear time complexity O(n) and constant space complexity O(1).</p>
 */
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
