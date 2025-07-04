package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static leetcode.tasks._0283_MoveZeroes.moveZeroes;
import static leetcode.tasks._0283_MoveZeroes.moveZeroesOptimal;
import static org.assertj.core.api.Assertions.assertThat;

class _0283_MoveZeroesTest {

    @Test
    void testExample1() {
        int[] input = {0, 1, 0, 3, 12};
        moveZeroes(input);
        assertThat(input).containsExactly(1, 3, 12, 0, 0);
    }

    @Test
    void testExample2() {
        int[] input = {0};
        moveZeroes(input);
        assertThat(input).containsExactly(0);
    }

    @Test
    void testNoZeroes() {
        int[] input = {1, 2, 3};
        moveZeroes(input);
        assertThat(input).containsExactly(1, 2, 3);
    }

    @Test
    void testAllZeroes() {
        int[] input = {0, 0, 0};
        moveZeroes(input);
        assertThat(input).containsExactly(0, 0, 0);
    }

    @Test
    void testZerosAtEnd() {
        int[] input = {1, 2, 3, 0, 0};
        moveZeroes(input);
        assertThat(input).containsExactly(1, 2, 3, 0, 0);
    }

    @Test
    void testZerosAtStart() {
        int[] input = {0, 0, 1, 2};
        moveZeroes(input);
        assertThat(input).containsExactly(1, 2, 0, 0);
    }

    @Test
    void testInterleavedZeros() {
        int[] input = {0, 1, 0, 2, 0, 3};
        moveZeroes(input);
        assertThat(input).containsExactly(1, 2, 3, 0, 0, 0);
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        moveZeroes(input);
        assertThat(input).isEmpty();
    }

    @Test
    void testExample1Optimal() {
        int[] input = {0, 1, 0, 3, 12};
        moveZeroesOptimal(input);
        assertThat(input).containsExactly(1, 3, 12, 0, 0);
    }

    @Test
    void testExample2Optimal() {
        int[] input = {0};
        moveZeroesOptimal(input);
        assertThat(input).containsExactly(0);
    }

    @Test
    void testNoZeroesOptimal() {
        int[] input = {1, 2, 3};
        moveZeroesOptimal(input);
        assertThat(input).containsExactly(1, 2, 3);
    }

    @Test
    void testAllZeroesOptimal() {
        int[] input = {0, 0, 0};
        moveZeroesOptimal(input);
        assertThat(input).containsExactly(0, 0, 0);
    }

    @Test
    void testZerosAtEndOptimal() {
        int[] input = {1, 2, 3, 0, 0};
        moveZeroesOptimal(input);
        assertThat(input).containsExactly(1, 2, 3, 0, 0);
    }

    @Test
    void testZerosAtStartOptimal() {
        int[] input = {0, 0, 1, 2};
        moveZeroesOptimal(input);
        assertThat(input).containsExactly(1, 2, 0, 0);
    }

    @Test
    void testInterleavedZerosOptimal() {
        int[] input = {0, 1, 0, 2, 0, 3};
        moveZeroesOptimal(input);
        assertThat(input).containsExactly(1, 2, 3, 0, 0, 0);
    }

    @Test
    void testEmptyArrayOptimal() {
        int[] input = {};
        moveZeroesOptimal(input);
        assertThat(input).isEmpty();
    }
}
