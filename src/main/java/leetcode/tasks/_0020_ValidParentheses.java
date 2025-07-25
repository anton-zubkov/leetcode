package leetcode.tasks;

import java.util.Map;
import java.util.Stack;

public class _0020_ValidParentheses {

    /**
     * The method uses a stack-based approach:
     * - For each opening bracket, push the expected closing bracket to the stack.
     * - For each closing bracket, check if it matches the top of the stack.
     * - At the end, the stack must be empty for the string to be valid.
     * Time Complexity: O(n) — where n is the length of the input string.
     * Space Complexity: O(n) — in the worst case, all characters are opening brackets.
     */
    public static boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        );

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(map.get(c));
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
