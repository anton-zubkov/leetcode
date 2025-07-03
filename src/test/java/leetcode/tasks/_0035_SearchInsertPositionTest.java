package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _0035_SearchInsertPositionTest {

    @Test
    void searchInsert1() {
        assertThat(_0035_SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
    }

    @Test
    void searchInsert2() {
        assertThat(_0035_SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
    }

    @Test
    void searchInsert3() {
        assertThat(_0035_SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
    }

    @Test
    void searchInsert4() {
        assertThat(_0035_SearchInsertPosition.searchInsert(new int[]{1}, 1)).isEqualTo(0);
    }
}