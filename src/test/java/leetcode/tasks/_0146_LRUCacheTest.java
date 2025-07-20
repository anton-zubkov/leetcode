package leetcode.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0146_LRUCacheTest {

    @Test
    void testExampleScenario() {
        _0146_LRUCache lRUCache = new _0146_LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        assertEquals(1, lRUCache.get(1)); // returns 1

        lRUCache.put(3, 3); // evicts key 2, cache is {1=1, 3=3}
        assertEquals(-1, lRUCache.get(2)); // returns -1 (not found)

        lRUCache.put(4, 4); // evicts key 1, cache is {4=4, 3=3}
        assertEquals(-1, lRUCache.get(1)); // returns -1 (not found)
        assertEquals(3, lRUCache.get(3)); // returns 3
        assertEquals(4, lRUCache.get(4)); // returns 4
    }

    @Test
    void testUpdateExistingKey() {
        _0146_LRUCache cache = new _0146_LRUCache(2);
        cache.put(1, 1);
        cache.put(1, 10); // update existing key
        assertEquals(10, cache.get(1));
    }

    @Test
    void testCapacityOneEviction() {
        _0146_LRUCache cache = new _0146_LRUCache(1);
        cache.put(1, 1);
        cache.put(2, 2); // should evict key 1
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    void testGetMovesToRecent() {
        _0146_LRUCache cache = new _0146_LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        // Access key 1 to make it recent
        assertEquals(1, cache.get(1));
        cache.put(3, 3); // should evict key 2
        assertEquals(-1, cache.get(2));
        assertEquals(1, cache.get(1));
        assertEquals(3, cache.get(3));
    }

}