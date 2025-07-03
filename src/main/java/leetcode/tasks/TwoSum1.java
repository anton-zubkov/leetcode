package leetcode.tasks;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {
        /**
         *  Brute-force Solution
         *  Time Complexity O(n²)
         *  Space Complexity O(1)
         */
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        /**
         *
         *  Time Complexity O(n)
         *  Space Complexity O(n)
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
