package lesson9task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OwnMapImplementationTest {

    private OwnMapImplementation map;
    @Test
    void shouldPut() {
        map = new OwnMapImplementation();
        assertTrue(map.put("key1", "value1"));
        assertFalse(map.put("key1", "value2"));
    }

    @Test
    void shouldContainKey() {
        map = new OwnMapImplementation();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertTrue(map.containsKey("key1"));
        assertTrue(map.containsKey("key2"));
        assertFalse(map.containsKey("key3"));
    }

    @Test
    void shouldContainValue() {
        map = new OwnMapImplementation();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertTrue(map.containsValue("value1"));
        assertTrue(map.containsValue("value2"));
        assertFalse(map.containsValue("value3"));
    }

    @Test
    void shouldRemoveKey() {
        map = new OwnMapImplementation();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals("value1", map.remove("key1"));
        assertNull(map.remove("key3"));
    }

    @Test
    void shouldGet() {
        map = new OwnMapImplementation();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals("value1", map.get("key1"));
        assertNull(map.get("key3"));
    }
}