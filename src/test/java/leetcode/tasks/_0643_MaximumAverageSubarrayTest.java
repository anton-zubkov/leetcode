package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static leetcode.tasks._0643_MaximumAverageSubarray.findMaxAverage;
import static org.junit.jupiter.api.Assertions.*;

class _0643_MaximumAverageSubarrayTest {

    @Test
    void testExample1() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75;
        assertEquals(expected, findMaxAverage(nums, k), 1e-5);
    }

    @Test
    void testExample2() {
        int[] nums = {5};
        int k = 1;
        double expected = 5.0;
        assertEquals(expected, findMaxAverage(nums, k), 1e-5);
    }

    @Test
    void testAllNegative() {
        int[] nums = {-5, -3, -1, -7};
        int k = 2;
        double expected = -2.0;
        assertEquals(expected, findMaxAverage(nums, k), 1e-5);
    }

    @Test
    void testAllSame() {
        int[] nums = {4, 4, 4, 4, 4};
        int k = 3;
        double expected = 4.0;
        assertEquals(expected, findMaxAverage(nums, k), 1e-5);
    }

    @Test
    void testEdgeCaseKEqualsLength() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        double expected = 3.0;
        assertEquals(expected, findMaxAverage(nums, k), 1e-5);
    }
}