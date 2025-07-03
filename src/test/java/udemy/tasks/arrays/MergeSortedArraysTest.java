package udemy.tasks.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArraysTest {

    @Test
    void mergeSortedArrays() {
        int[] arr1 = {0, 3, 4, 31};
        int[] arr2 = {4, 6, 30};
        int[] expected = {0, 3, 4, 4, 6, 30, 31};

        int[] result = MergeSortedArrays.mergeSortedArrays(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    @Test
    void mergeSortedArraysFirstArrayEmpty() {
        int[] arr1 = {};
        int[] arr2 = {4, 6, 30};
        int[] expected = {4, 6, 30};

        int[] result = MergeSortedArrays.mergeSortedArrays(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    @Test
    void mergeSortedArraysSecondArrayEmpty() {
        int[] arr1 = {0, 3, 4, 31};
        int[] arr2 = {};
        int[] expected = {0, 3, 4, 31};

        int[] result = MergeSortedArrays.mergeSortedArrays(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    @Test
    void mergeSortedArraysBothArraysEmpty() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};

        int[] result = MergeSortedArrays.mergeSortedArrays(arr1, arr2);

        assertArrayEquals(expected, result);
    }
}