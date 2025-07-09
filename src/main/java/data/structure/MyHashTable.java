package data.structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * A simple generic hash table implementation using separate chaining (linked lists) for collision resolution.
 * Supports basic operations: put, get, remove, containsKey, keys, values, entries, and automatic resizing.
 *
 * @param <K> type of keys
 * @param <V> type of values
 * Time complexity (average case):
 * - put: O(1)
 * - get: O(1)
 * - remove: O(1)
 * - keys/values/entries: O(N)
 *
 * Space complexity: O(N)
 */
public class MyHashTable<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;
    private int size = 0;
    private float loadFactor;
    private LinkedList<Entry<K, V>>[] buckets;

    public MyHashTable() {
        this(DEFAULT_CAPACITY, LOAD_FACTOR);
    }

    public MyHashTable(int capacity, float loadFactor) {
        this.buckets = new LinkedList[capacity];
        this.size = 0;
        this.loadFactor = loadFactor;
        IntStream.range(0, capacity).forEach(i -> buckets[i] = new LinkedList<>());
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        size++;

        if ((float) size / buckets.length > loadFactor) {
            resize();
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        Iterator<Entry<K, V>> iterator = bucket.iterator();
        while (iterator.hasNext()) {
            Entry<K, V> next = iterator.next();
            if (next.key.equals(key)) {
                iterator.remove();
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean containsKey(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public List<K> keys() {
        List<K> result = new ArrayList<>();
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> kvEntry : bucket) {
                result.add(kvEntry.key);
            }
        }
        return result;
    }

    public List<V> values() {
        List<V> result = new ArrayList<>();
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> kvEntry : bucket) {
                result.add(kvEntry.value);
            }
        }
        return result;
    }

    public List<Entry<K, V>> entries() {
        List<Entry<K, V>> result = new ArrayList<>();
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> kvEntry : bucket) {
                result.add(kvEntry);
            }
        }
        return result;
    }

    public void clear() {
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            bucket.clear();
        }
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    private void resize() {
        int newCapacity = buckets.length * 2;
        LinkedList<Entry<K, V>>[] newBuckets = new LinkedList[newCapacity];
        IntStream.range(0, newCapacity).forEach(i -> newBuckets[i] = new LinkedList<>());
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                int newIndex = Math.abs(entry.key.hashCode()) % newCapacity;
                newBuckets[newIndex].add(entry);
            }
        }
        buckets = newBuckets;
    }

    private static class Entry<K, V> {
        final K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
