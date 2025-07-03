package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class _0136_SingleNumberTest {

    @Test
    void singleNumber1() {
        assertThat(_0136_SingleNumber.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
    }

    @Test
    void singleNumber2() {
        assertThat(_0136_SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
    }

    @Test
    void singleNumber3() {
        assertThat(_0136_SingleNumber.singleNumber(new int[]{1})).isEqualTo(1);
    }
}