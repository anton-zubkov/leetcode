package leetcode.tasks;

import java.util.HashSet;

public class _0217_ContainsDuplicate {

    /**
     * This method uses a {@link java.util.HashSet} to track elements as they are seen.
     * If an element is already present in the set, it means a duplicate exists.
     * Time Complexity O(n)
     * Space Complexity O(n)
     */
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        var seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }
}
