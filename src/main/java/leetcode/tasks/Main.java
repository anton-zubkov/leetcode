package leetcode.tasks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4};
        System.out.println(Arrays.toString(arr));
        long count = Arrays.stream(arr).count();
        Arrays.sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
