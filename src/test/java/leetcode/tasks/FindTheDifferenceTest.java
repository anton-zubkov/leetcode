package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheDifferenceTest {

    @Test
    void indTheDifference1() {
        assertThat(FindTheDifference.findTheDifference("abcd", "abcde")).isEqualTo('e');
    }

    @Test
    void indTheDifference2() {
        assertThat(FindTheDifference.findTheDifference("", "y")).isEqualTo('y');
    }
}