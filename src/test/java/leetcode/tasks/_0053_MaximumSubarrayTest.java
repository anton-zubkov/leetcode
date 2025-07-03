package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static leetcode.tasks._0053_MaximumSubarray.maxSubArray;
import static org.junit.jupiter.api.Assertions.*;

class _0053_MaximumSubarrayTest {

    @Test
    void testExample1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        assertEquals(expected, maxSubArray(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {1};
        int expected = 1;
        assertEquals(expected, maxSubArray(nums));
    }

    @Test
    void testExample3() {
        int[] nums = {5, 4, -1, 7, 8};
        int expected = 23;
        assertEquals(expected, maxSubArray(nums));
    }

    @Test
    void testAllNegatives() {
        int[] nums = {-8, -3, -6, -2, -5, -4};
        int expected = -2;
        assertEquals(expected, maxSubArray(nums));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> maxSubArray(nums));
    }
}
