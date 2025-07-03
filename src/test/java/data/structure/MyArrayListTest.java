package data.structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyArrayListTest {

    private MyArrayList<String> arr;

    @BeforeEach
    void setUp() {
        arr = new MyArrayList<>();
    }

    @Test
    void shouldReturnCorrectElementByIndex() {
        populate("one", "two", "three");
        assertThat(arr.get(1)).isEqualTo("two");
    }

    @Test
    void shouldReturnExceptionWhenIndexToHigh() {
        populate("one", "two", "three");
        assertThrows(IndexOutOfBoundsException.class, () -> arr.get(15));
    }

    @Test
    void shouldIncreaseSizeWhenElementIsAdded() {
        arr.add("one");
        assertThat(arr.size()).isEqualTo(1);
    }

    @Test
    void containsElementIfItPresent() {
        arr.add("one");
        assertThat(arr.contains("one")).isTrue();
    }

    @Test
    void containsElementIfItNotPresent() {
        assertThat(arr.contains("one")).isFalse();
    }

    @Test
    void clear() {
        populate("one", "two", "three");
        arr.clear();
        assertThat(arr.size()).isEqualTo(0);
    }

    @Test
    void indexOf() {
        populate("one", "two", "three");
        var index = arr.indexOf("two");
        assertThat(index).isEqualTo(1);
    }

    @Test
    void shouldIncreaseCapacityWhenElementsAreAdded() {
        populate("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        arr.add("eleven");
        assertThat(arr.size()).isEqualTo(11);
    }

    @Test
    void shouldInsertElementAtSpecificIndex() {
        populate("one", "two", "three");
        arr.add(1, "newElem");

        assertThat(arr.size()).isEqualTo(4);
        assertThat(arr.get(0)).isEqualTo("one");
        assertThat(arr.get(1)).isEqualTo("newElem");
        assertThat(arr.get(2)).isEqualTo("two");
        assertThat(arr.get(3)).isEqualTo("three");
    }

    @Test
    void shouldRemoveElementAtIndex() {
        populate("one", "two", "three");
        arr.remove(1);

        assertThat(arr.size()).isEqualTo(2);
        assertThat(arr.get(0)).isEqualTo("one");
        assertThat(arr.get(1)).isEqualTo("three");
    }

    @Test
    void shouldReturnCorrectSize() {
        populate("one", "two", "three");
        assertThat(arr.size()).isEqualTo(3);
    }

    @Test
    void iteratorShouldReturnAllElementsInOrder() {
        populate("one", "two", "three");

        Iterator<String> it = arr.iterator();

        assertThat(it.hasNext()).isTrue();
        assertThat(it.next()).isEqualTo("one");
        assertThat(it.next()).isEqualTo("two");
        assertThat(it.next()).isEqualTo("three");
        assertThat(it.hasNext()).isFalse();
    }

    private void populate(String... elements) {
        for (String s : elements) {
            arr.add(s);
        }
    }
}