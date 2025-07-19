package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static leetcode.tasks._0013_RomanToInteger.romanToInt;
import static org.junit.jupiter.api.Assertions.assertEquals;

class _0013_RomanToIntegerTest {

    @Test
    void shouldReturn3ForIII() {
        assertEquals(3, romanToInt("III"));
    }

    @Test
    void shouldReturn4ForIV() {
        assertEquals(4, romanToInt("IV"));
    }

    @Test
    void shouldReturn9ForIX() {
        assertEquals(9, romanToInt("IX"));
    }

    @Test
    void shouldReturn58ForLVIII() {
        assertEquals(58, romanToInt("LVIII"));
    }

    @Test
    void shouldReturn1994ForMCMXCIV() {
        assertEquals(1994, romanToInt("MCMXCIV"));
    }

    @Test
    void shouldReturn1ForI() {
        assertEquals(1, romanToInt("I"));
    }

    @Test
    void shouldReturn3999ForMMMCMXCIX() {
        assertEquals(3999, romanToInt("MMMCMXCIX"));
    }

    @Test
    void shouldReturn40ForXL() {
        assertEquals(40, romanToInt("XL"));
    }

    @Test
    void shouldReturn90ForXC() {
        assertEquals(90, romanToInt("XC"));
    }

    @Test
    void shouldReturn400ForCD() {
        assertEquals(400, romanToInt("CD"));
    }

    @Test
    void shouldReturn900ForCM() {
        assertEquals(900, romanToInt("CM"));
    }
}