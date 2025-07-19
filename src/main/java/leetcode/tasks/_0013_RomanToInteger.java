package leetcode.tasks;

import java.util.Map;

public class _0013_RomanToInteger {

    /**
     * Converts a Roman numeral string to an integer.
     * <p>
     * This method maps each Roman numeral character to its integer value
     * and processes the string from left to right. If the current character's value
     * is less than the next character's value, it applies the subtraction rule
     * (e.g., IV = 4). Otherwise, it adds the value to the result.
     * </p>
     *
     * Time Complexity: O(n), where n is the length of the input string. Each character is processed at most once.
     * <br>
     * <Space Complexity: O(1) extra space (excluding input string) if using direct access via {@code charAt}.
     */
    public static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        if (s.isEmpty()) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }
}
