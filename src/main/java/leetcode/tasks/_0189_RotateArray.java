package leetcode.tasks;

public class _0189_RotateArray {

    /**
     * Approach with System.arraycopy
     * Time complexity: O(n)
     * Space complexity: O(k)
     */
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k < 0 || k > n) throw new IllegalArgumentException();

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        System.arraycopy(nums, 0, nums, k, n - k);
        System.arraycopy(temp, 0, nums, 0, k);
    }

    /**
     * Reverse-in-place
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static void rotateOptimal(int[] nums, int k) {
        int n = nums.length;
        if (k < 0 || k > n) throw new IllegalArgumentException();

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
