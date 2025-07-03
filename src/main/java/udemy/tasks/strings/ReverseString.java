package udemy.tasks.strings;

public class ReverseString {

    /**
     * Reverses the given string manually using a <b>two-pointer swap algorithm</b>.
     * <p>
     * The method splits the input string into an array of characters (as strings),
     * then swaps characters from both ends moving toward the center.
     * </p>
     *
     * <p><b>Algorithm:</b> Two-pointer reverse (manual swapping)<br>
     * <b>Time complexity:</b> O(n)<br>
     * <b>Space complexity:</b> O(n) – due to intermediate array and result string
     * </p>
     *
     * @param s the input string to reverse (non-null)
     * @return the reversed string
     * @throws IllegalArgumentException if the input string is null
     */
    public static String reverseString(String s) {
        // Throw exception if string is null
        if (s == null) throw new IllegalArgumentException("String cannot be null");

        // Return early if the string is empty or has only one character
        if (s.length() < 2) return s;

        String[] chars = s.split("");

        for (int i = 0; i < chars.length / 2; i++) {
            var temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        return String.join("", chars);
    }

    /**
     * Reverses the given string using {@link StringBuffer#reverse()}, which
     * internally uses a character array and swaps characters in place.
     * <p>
     * This method is concise, efficient, and preferable unless custom logic is required.
     * </p>
     *
     * <p><b>Algorithm:</b> In-place character swap via StringBuffer<br>
     * <b>Time complexity:</b> O(n)<br>
     * <b>Space complexity:</b> O(n) – due to internal buffer copy
     * </p>
     *
     * @param s the input string to reverse (non-null)
     * @return the reversed string
     * @throws IllegalArgumentException if the input string is null
     */
    public static String reverseString2(String s) {
        if (s == null) throw new IllegalArgumentException("String cannot be null");
        return new StringBuffer(s).reverse().toString();
    }
}
