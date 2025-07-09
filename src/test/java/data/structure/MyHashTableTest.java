package data.structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashTableTest {
    private MyHashTable<String, Integer> table;

    @BeforeEach
    void setUp() {
        table = new MyHashTable<>();
    }

    @Test
    void testPutAndGet() {
        table.put("apple", 1);
        table.put("banana", 2);
        assertEquals(1, table.get("apple"));
        assertEquals(2, table.get("banana"));
    }

    @Test
    void testOverwriteValue() {
        table.put("key", 42);
        table.put("key", 99);
        assertEquals(99, table.get("key"));
    }

    @Test
    void testRemove() {
        table.put("one", 1);
        assertTrue(table.remove("one"));
        assertNull(table.get("one"));
        assertFalse(table.remove("one"));
    }

    @Test
    void testContainsKey() {
        table.put("cat", 3);
        assertTrue(table.containsKey("cat"));
        assertFalse(table.containsKey("dog"));
    }

    @Test
    void testKeys() {
        table.put("a", 1);
        table.put("b", 2);
        table.put("c", 3);
        assertTrue(table.keys().contains("a"));
        assertTrue(table.keys().contains("b"));
        assertTrue(table.keys().contains("c"));
        assertEquals(3, table.keys().size());
    }

    @Test
    void testValues() {
        table.put("x", 10);
        table.put("y", 20);
        assertTrue(table.values().contains(10));
        assertTrue(table.values().contains(20));
        assertEquals(2, table.values().size());
    }

    @Test
    void testClear() {
        table.put("a", 1);
        table.put("b", 2);
        table.clear();
        assertEquals(0, table.keys().size());
    }

    @Test
    void testResize() {
        MyHashTable<Integer, Integer> bigTable = new MyHashTable<>(4, 0.5f);
        for (int i = 0; i < 100; i++) {
            bigTable.put(i, i * 10);
        }
        for (int i = 0; i < 100; i++) {
            assertEquals(i * 10, bigTable.get(i));
        }
    }

    @Test
    void testRemoveNonExistentKey() {
        assertFalse(table.remove("nonexistent"));
    }

    @Test
    void testPutNullValue() {
        table.put("nullValue", null);
        assertNull(table.get("nullValue"));
        assertTrue(table.containsKey("nullValue"));
    }
}
