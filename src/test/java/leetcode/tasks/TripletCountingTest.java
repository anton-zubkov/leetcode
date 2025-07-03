package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TripletCountingTest {

    @Test
    void countTriplets1() {
        assertThat(TripletCounting.countTriplets(new int[]{10, 10, 20, 30, 40}, 60))
                .isEqualTo(3);
    }

    @Test
    void countTriplets2() {
        assertThat(TripletCounting.countTriplets(new int[]{1, 2, 3, 4, 5}, 6))
                .isEqualTo(1);
    }
}