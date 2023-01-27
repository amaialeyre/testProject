package lesson9task2;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnQueueImplementationTest {
    private OwnQueueImplementation queue;

    @Before
    public void setUp() {
        queue = new OwnQueueImplementation();
    }

    @Test
    void add() {
        setUp();
        assertTrue(queue.add(1));
        assertTrue(queue.add(2));
        assertTrue(queue.add(3));
    }

    @Test
    void remove() {
        setUp();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(1, queue.remove());
        assertEquals(2, queue.remove());
        assertEquals(3, queue.remove());
    }

    @Test
    void element() {
        setUp();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(1, queue.element());
        queue.remove();
        assertEquals(2, queue.element());
    }
}