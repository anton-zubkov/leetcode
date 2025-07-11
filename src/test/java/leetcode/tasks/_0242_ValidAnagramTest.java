package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static leetcode.tasks._0242_ValidAnagram.*;
import static org.junit.jupiter.api.Assertions.*;

class _0242_ValidAnagramTest {

    @Test
    void testIsAnagramTrueSimple() {
        assertTrue(isAnagram("anagram", "nagaram"));
    }

    @Test
    void testIsAnagramFalseSimple() {
        assertFalse(isAnagram("rat", "car"));
    }

    @Test
    void testIsAnagramEmptyStrings() {
        assertTrue(isAnagram("", ""));
    }

    @Test
    void testIsAnagramDifferentLengths() {
        assertFalse(isAnagram("abc", "ab"));
    }

    @Test
    void testIsAnagramSameLettersDifferentCounts() {
        assertFalse(isAnagram("aabbcc", "aabbc"));
    }

    @Test
    void testIsAnagramSingleCharTrue() {
        assertTrue(isAnagram("a", "a"));
    }

    @Test
    void testIsAnagramSingleCharFalse() {
        assertFalse(isAnagram("a", "b"));
    }

    @Test
    void testIsAnagramTrueSimpleMap() {
        assertTrue(isAnagramMap("anagram", "nagaram"));
    }

    @Test
    void testIsAnagramFalseSimpleMap() {
        assertFalse(isAnagramMap("rat", "car"));
    }

    @Test
    void testIsAnagramEmptyStringsMap() {
        assertTrue(isAnagramMap("", ""));
    }

    @Test
    void testIsAnagramDifferentLengthsMap() {
        assertFalse(isAnagramMap("abc", "ab"));
    }

    @Test
    void testIsAnagramSameLettersDifferentCountsMap() {
        assertFalse(isAnagramMap("aabbcc", "aabbc"));
    }

    @Test
    void testIsAnagramSingleCharTrueMap() {
        assertTrue(isAnagramMap("a", "a"));
    }

    @Test
    void testIsAnagramSingleCharFalseMap() {
        assertFalse(isAnagramMap("a", "b"));
    }
    @Test
    void testIsAnagramTrueSimpleSort() {
        assertTrue(isAnagramSort("anagram", "nagaram"));
    }

    @Test
    void testIsAnagramFalseSimpleSort() {
        assertFalse(isAnagramSort("rat", "car"));
    }

    @Test
    void testIsAnagramEmptyStringsSort() {
        assertTrue(isAnagramSort("", ""));
    }

    @Test
    void testIsAnagramDifferentLengthsSort() {
        assertFalse(isAnagramSort("abc", "ab"));
    }

    @Test
    void testIsAnagramSameLettersDifferentCountsSort() {
        assertFalse(isAnagramSort("aabbcc", "aabbc"));
    }

    @Test
    void testIsAnagramSingleCharTrueSort() {
        assertTrue(isAnagramSort("a", "a"));
    }

    @Test
    void testIsAnagramSingleCharFalseSort() {
        assertFalse(isAnagramSort("a", "b"));
    }
}
