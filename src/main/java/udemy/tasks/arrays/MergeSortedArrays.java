package udemy.tasks.arrays;

public class MergeSortedArrays {

    /**
     * Merges two sorted integer arrays into a single sorted array.
     * <p>
     * This method implements the classic <b>two-pointer merge algorithm</b>, which is
     * commonly used as a subroutine in merge sort. It assumes that both input arrays
     * are already sorted in non-decreasing order and produces a new array containing
     * all elements from both arrays, also in non-decreasing order.
     * </p>
     *
     * <p><b>Algorithm:</b> Two-pointer linear merge<br>
     * <b>Time complexity:</b> O(n + m), where n = a.length, m = b.length<br>
     * <b>Space complexity:</b> O(n + m), for the resulting array
     * </p>
     *
     * @param a the first sorted array (may be empty)
     * @param b the second sorted array (may be empty)
     * @return a new sorted array containing all elements from {@code a} and {@code b}
     */
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }
}
