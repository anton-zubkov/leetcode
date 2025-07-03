package data.structure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Main Idea:
 * - Backed by a dynamically growing array
 * - Doubling strategy for resizing
 */
public class MyArrayList<T> implements Iterable<T> {

    private Object[] data;
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public T get(int index) {
        checkBounds(index);
        return (T) data[index];
    }

    /**
     * Amortized time complexity: O(1)
     * Space complexity: O(1) (except during resizing)
     */
    public void add(T element) {
        ensureCapacity();
        data[size++] = element;
    }


    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public void add(int index, T element) {
        checkBounds(index);
        ensureCapacity();
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public void remove(int index) {
        checkBounds(index);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }

    public int size() {
        return size;
    }


    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public boolean contains(T element) {
        return indexOf(element) > 0;
    }

    public void clear() {
        for (var i = 0; i < data.length; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public int indexOf(T element) {
        for (var i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], element)) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return size > index;
            }

            @Override
            public T next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) data[index++];
            }
        };
    }

    private void ensureCapacity() {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    private void checkBounds(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
