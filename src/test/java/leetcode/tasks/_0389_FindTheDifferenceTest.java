package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _0389_FindTheDifferenceTest {

    @Test
    void indTheDifference1() {
        assertThat(_0389_FindTheDifference.findTheDifference("abcd", "abcde")).isEqualTo('e');
    }

    @Test
    void indTheDifference2() {
        assertThat(_0389_FindTheDifference.findTheDifference("", "y")).isEqualTo('y');
    }
}