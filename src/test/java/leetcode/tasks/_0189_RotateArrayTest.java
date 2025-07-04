package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static leetcode.tasks._0189_RotateArray.rotate;
import static leetcode.tasks._0189_RotateArray.rotateOptimal;
import static org.junit.jupiter.api.Assertions.*;

class _0189_RotateArrayTest {

    @Test
    void testExample1() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        rotate(input, 3);
        assertArrayEquals(expected, input);
    }

    @Test
    void testExample2() {
        int[] input = {-1, -100, 3, 99};
        int[] expected = {3, 99, -1, -100};
        rotate(input, 2);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRotateByZero() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        rotate(input, 0);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRotateByLength() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        rotate(input, 3);
        assertArrayEquals(expected, input);
    }

    @Test
    void testInvalidKTooLarge() {
        int[] input = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> rotate(input, 5));
    }

    @Test
    void testNegativeKShouldNotThrow() {
        int[] input = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> rotate(input, -1));
    }

    @Test
    void testExample1Optimal() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        rotateOptimal(input, 3);
        assertArrayEquals(expected, input);
    }

    @Test
    void testExample2Optimal() {
        int[] input = {-1, -100, 3, 99};
        int[] expected = {3, 99, -1, -100};
        rotateOptimal(input, 2);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRotateByZeroOptimal() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        rotateOptimal(input, 0);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRotateByLengtOptimalh() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        rotateOptimal(input, 3);
        assertArrayEquals(expected, input);
    }

    @Test
    void testInvalidKTooLargeOptimal() {
        int[] input = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> rotateOptimal(input, 5));
    }

    @Test
    void testNegativeKShouldNotThrowOptimal() {
        int[] input = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> rotateOptimal(input, -1));
    }
}
