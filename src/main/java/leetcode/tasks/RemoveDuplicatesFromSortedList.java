package leetcode.tasks;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * two pointers
 */
public class RemoveDuplicatesFromSortedList {

    public static boolean deleteDuplicates(List<Long> carousels) {
        List<Long> inactiveIds = List.of(3L);

        return carousels.stream()
                .filter(Objects::nonNull)
                .anyMatch(carousel -> inactiveIds.contains(carousel));
    }

    public static void main(String[] args) {
        List<Long> carousels = List.of(1L, 2L);
        boolean b = deleteDuplicates(carousels);
        carousels = List.of(3L);
        boolean b1 = deleteDuplicates(carousels);
        carousels = null;
        boolean b2 = deleteDuplicates(carousels);
        System.out.println("" + b+b1+b2);
    }
}
