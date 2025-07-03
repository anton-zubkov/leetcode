package leetcode.tasks;

/**
 * used xor
 */
public class _0389_FindTheDifference {

    public static char findTheDifference(String s, String t) {
        char d = 0;
        for (char c : s.toCharArray()) {
            d ^= c;
        }
        for (char c : t.toCharArray()) {
            d ^= c;
        }
        return d;
    }
}
