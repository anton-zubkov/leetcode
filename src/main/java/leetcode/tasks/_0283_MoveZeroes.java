package leetcode.tasks;

public class _0283_MoveZeroes {

    /**
     * Solution with Two Pointers
     * Time Complexity O(n²)
     * Space Complexity O(1)
     */
    public static void moveZeroes(int[] nums) {
        int i = 0, j = 1;

        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            } else if (nums[i] != 0) {
                i++;
            }
            j = Math.max(j + 1, i + 1);
        }
    }

    /**
     *  Solution with Insertion Position
     *  Time Complexity O(n)
     *  Space Complexity O(1)
     */
    public static void moveZeroesOptimal(int[] nums) {
        int insertPos = 0;

        for (var num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
