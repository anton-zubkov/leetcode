package leetcode.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum1Test {

    @Test
    public void testExample1WithOptimalImpl() {
        int[] result = TwoSum1.twoSumOptimal(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(result, new int[]{0, 1}) || Arrays.equals(result, new int[]{1, 0}));
    }

    @Test
    public void testExample2WithOptimalImpl() {
        int[] result = TwoSum1.twoSumOptimal(new int[]{3, 2, 4}, 6);
        assertTrue(Arrays.equals(result, new int[]{1, 2}) || Arrays.equals(result, new int[]{2, 1}));
    }

    @Test
    public void testExample3WithOptimalImpl() {
        int[] result = TwoSum1.twoSumOptimal(new int[]{3, 3}, 6);
        assertTrue(Arrays.equals(result, new int[]{0, 1}) || Arrays.equals(result, new int[]{1, 0}));
    }

    @Test
    public void testZeroAndPositiveWithOptimalImpl() {
        int[] result = TwoSum1.twoSum(new int[]{0, 4, 3, 0}, 0);
        assertTrue(Arrays.equals(result, new int[]{0, 3}) || Arrays.equals(result, new int[]{3, 0}));
    }

    @Test
    public void testLargeInputWithOptimalImpl() {
        int[] nums = new int[100000];
        for (int i = 0; i < 99999; i++) {
            nums[i] = i;
        }
        nums[99999] = 99999;
        int[] result = TwoSum1.twoSum(nums, 199997);
        assertTrue(result.length == 2);
        assertEquals(99998, nums[result[0]]);
        assertEquals(99999, nums[result[1]]);
    }

    @Test
    public void testNoSolutionWithOptimalImpl() {
        assertThrows(IllegalArgumentException.class, () -> {
            TwoSum1.twoSum(new int[]{1, 2, 3}, 7);
        });
    }

    @Test
    public void testExample1BruteForceImpl() {
        int[] result = TwoSum1.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(result, new int[]{0, 1}) || Arrays.equals(result, new int[]{1, 0}));
    }

    @Test
    public void testExample2BruteForceImpl() {
        int[] result = TwoSum1.twoSum(new int[]{3, 2, 4}, 6);
        assertTrue(Arrays.equals(result, new int[]{1, 2}) || Arrays.equals(result, new int[]{2, 1}));
    }

    @Test
    public void testExample3BruteForceImpl() {
        int[] result = TwoSum1.twoSum(new int[]{3, 3}, 6);
        assertTrue(Arrays.equals(result, new int[]{0, 1}) || Arrays.equals(result, new int[]{1, 0}));
    }

    @Test
    public void testZeroAndPositiveBruteForceImpl() {
        int[] result = TwoSum1.twoSum(new int[]{0, 4, 3, 0}, 0);
        assertTrue(Arrays.equals(result, new int[]{0, 3}) || Arrays.equals(result, new int[]{3, 0}));
    }

    @Test
    public void testLargeInputBruteForceImpl() {
        int[] nums = new int[100000];
        for (int i = 0; i < 99999; i++) {
            nums[i] = i;
        }
        nums[99999] = 99999;
        int[] result = TwoSum1.twoSum(nums, 199997);
        assertTrue(result.length == 2);
        assertEquals(99998, nums[result[0]]);
        assertEquals(99999, nums[result[1]]);
    }

    @Test
    public void testNoSolutionBruteForceImpl() {
        assertThrows(IllegalArgumentException.class, () -> {
            TwoSum1.twoSum(new int[]{1, 2, 3}, 7);
        });
    }

}
