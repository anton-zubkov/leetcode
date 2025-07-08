package data.structure;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class MyHashTable<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private int size = 0;
    private LinkedList<Entry<K, V>>[] buckets;

    public MyHashTable() {
        this.buckets = new LinkedList[DEFAULT_CAPACITY];
        IntStream.range(0, DEFAULT_CAPACITY).forEach(i -> buckets[i] = new LinkedList<>());
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
    }

    public V get(K key) {
    }

    public void remove(K key) {
    }

    public boolean contains(K key) {
    }

    public int size() {
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
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
