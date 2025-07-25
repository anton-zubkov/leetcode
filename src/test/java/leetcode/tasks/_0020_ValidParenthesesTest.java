package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static leetcode.tasks._0020_ValidParentheses.isValid;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _0020_ValidParenthesesTest {

    @Test
    void testExample1() {
        assertTrue(isValid("()"));
    }

    @Test
    void testExample2() {
        assertTrue(isValid("()[]{}"));
    }

    @Test
    void testExample3() {
        assertFalse(isValid("(]"));
    }

    @Test
    void testExample4() {
        assertTrue(isValid("([])"));
    }

    @Test
    void testExample5() {
        assertFalse(isValid("([)]"));
    }

    @Test
    void testEmptyString() {
        assertTrue(isValid(""));
    }

    @Test
    void testOnlyOpening() {
        assertFalse(isValid("("));
    }

    @Test
    void testOnlyClosing() {
        assertFalse(isValid(")"));
    }

    @Test
    void testComplexValid() {
        assertTrue(isValid("{[()()]}"));
    }

    @Test
    void testComplexInvalid() {
        assertFalse(isValid("{[(])}"));
    }
}
