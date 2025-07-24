package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static leetcode.tasks._0014_LongestCommonPrefix.longestCommonPrefix;
import static org.junit.jupiter.api.Assertions.*;

class _0014_LongestCommonPrefixTest {

    @Test
    void example1() {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        assertEquals("fl", result);
    }

    @Test
    void example2() {
        String[] strs = {"dog", "racecar", "car"};
        String result = longestCommonPrefix(strs);
        assertEquals("", result);
    }

    @Test
    void emptyArray() {
        String[] strs = {};
        String result = longestCommonPrefix(strs);
        assertEquals("", result);
    }

    @Test
    void emptyStrings() {
        String[] strs = {"", "", ""};
        String result = longestCommonPrefix(strs);
        assertEquals("", result);
    }

    @Test
    void partialMatch() {
        String[] strs = {"interspecies", "interstellar", "interstate"};
        String result = longestCommonPrefix(strs);
        assertEquals("inters", result);
    }

    @Test
    void noCommonPrefix() {
        String[] strs = {"abc", "def", "ghi"};
        String result = longestCommonPrefix(strs);
        assertEquals("", result);
    }
}
