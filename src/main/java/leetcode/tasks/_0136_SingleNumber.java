package leetcode.tasks;

/**
 * resolved with xor operator -- there will be left beats only unique number
 */
public class _0136_SingleNumber {

    /**
     * a ^ a = 0
     * a ^ 0 = a
     * e.g. number 4 XOR
     * 0010
     * 0010
     * ====
     * 0000
     */
    public static int singleNumber(int[] nums) {
        var singleNumber = 0;

        for (var num : nums) {
            singleNumber ^= num;
        }

        return singleNumber;
    }
}
