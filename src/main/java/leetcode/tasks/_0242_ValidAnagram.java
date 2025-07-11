package leetcode.tasks;

import java.util.Arrays;
import java.util.HashMap;

public class _0242_ValidAnagram {

    /**
     * HashMap version is better if the problem allows Unicode, mixed case, or any char range (not just a–z),
     * then a Map is more general and correct.
     */
    public static boolean isAnagramMap(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!freqMap.containsKey(c)) return false;
            freqMap.put(c, freqMap.get(c) - 1);
            if (freqMap.get(c) == 0) freqMap.remove(c);
        }

        return freqMap.isEmpty();
    }

    /**
     * This method uses a fixed-size array of length 26 to count letter frequencies,
     * assuming the input strings contain only lowercase English letters ('a' to 'z').
     * </p>
     * <p>
     * Time Complexity: O(n), where n is the length of the strings.
     * Space Complexity: O(1) — uses a fixed-size array of 26 integers.
     * </p>
     * <p>
     * Note: This implementation only works correctly if both strings contain
     * exclusively lowercase English letters. The array index for each letter is calculated
     * using {@code char - 'a'}, which maps:
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) return false;
        }

        return true;
    }

    /*
    * Another simple solution using embed sorting
     */
    public static boolean isAnagramSort(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
