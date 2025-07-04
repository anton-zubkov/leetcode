package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static leetcode.tasks._0217_ContainsDuplicate.containsDuplicate;
import static org.junit.jupiter.api.Assertions.*;

class _0217_ContainsDuplicateTest {

    @Test
    void testDuplicateAtStartAndEnd() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(containsDuplicate(nums));
    }

    @Test
    void testAllUniqueElements() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(containsDuplicate(nums));
    }

    @Test
    void testMultipleDuplicates() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(containsDuplicate(nums));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertFalse(containsDuplicate(nums));
    }

    @Test
    void testSingleElement() {
        int[] nums = {42};
        assertFalse(containsDuplicate(nums));
    }

    @Test
    void testTwoSameElements() {
        int[] nums = {5, 5};
        assertTrue(containsDuplicate(nums));
    }

    @Test
    void testLargeDistinctArray() {
        int[] nums = new int[100_000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        assertFalse(containsDuplicate(nums));
    }

    @Test
    void testLargeWithOneDuplicate() {
        int[] nums = new int[100_001];
        for (int i = 0; i < 100_000; i++) {
            nums[i] = i;
        }
        nums[100_000] = 42;
        assertTrue(containsDuplicate(nums));
    }

    @Test
    void testNullArray() {
        assertThrows(
                IllegalArgumentException.class,
                () -> containsDuplicate(null)
        );
    }
}