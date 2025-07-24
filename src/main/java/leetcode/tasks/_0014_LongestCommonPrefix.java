package leetcode.tasks;

public class _0014_LongestCommonPrefix {

    /**
     * Finds the longest common prefix string amongst an array of strings.
     *
     * <p>This implementation uses a character-by-character comparison to minimize
     * unnecessary string operations and memory allocations. It works in O(N * M),
     * where N is the number of strings and M is the length of the shortest string.</p>
     *
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
