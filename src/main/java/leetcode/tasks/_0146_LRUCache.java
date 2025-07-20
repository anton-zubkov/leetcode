package leetcode.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * Design and implementation of an LRU (Least Recently Used) Cache.
 * <p>
 * This cache supports constant time O(1) operations for both get and put.
 * It uses a combination of:
 * <ul>
 *     <li>A HashMap for fast key lookup.</li>
 *     <li>A Doubly Linked List for tracking the usage order (most recently used to least recently used).</li>
 * </ul>
 *
 * When the capacity is exceeded, the least recently used entry is removed automatically.
 *
 * <h3>Operations:</h3>
 * <ul>
 *     <li><b>get(int key)</b> — Returns the value of the key if it exists, otherwise -1.</li>
 *     <li><b>put(int key, int value)</b> — Inserts or updates the value for the key.
 *     If the cache exceeds its capacity, it evicts the least recently used entry.</li>
 * </ul>
 *
 * <h3>Time Complexity:</h3>
 * Both {@code get} and {@code put} operations run in O(1) average time.
 *
 * <h3>Space Complexity:</h3>
 * O(capacity), since it maintains at most {@code capacity} entries in the map and linked list.
 *
 * Example usage:
 * <pre>
 * LRUCache cache = new LRUCache(2);
 * cache.put(1, 1);
 * cache.put(2, 2);
 * int val = cache.get(1); // returns 1
 * </pre>
 */
public class _0146_LRUCache {
    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;

    public _0146_LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        this.head = new Node();
        this.tail = new Node();
        this.head.next = tail;
        this.tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.value = value;
            moveToHead(node);
        } else {
            node = new Node(key, value);
            map.put(key, node);
            addNode(node);

            if (map.size() > capacity) {
                Node tail = popTail();
                map.remove(tail.key);
            }
        }
    }

    private void removeNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void addNode(Node node) {
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }

    private Node popTail() {
        Node res = tail.prev;
        removeNode(res);
        return res;
    }

    private class Node {
        int key;
        int value;

        Node prev, next;

        Node() {
        }

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
