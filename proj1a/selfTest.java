import static org.junit.Assert.*;

import org.junit.Test;

public class selfTest {
    @Test
    public void testSize() {
        LinkedListDeque deq1 = new LinkedListDeque(3);
        int sizeExpected = 1;
        int size = deq1.size();
        assertEquals(size, sizeExpected);
    }
    @Test
    public void testIsEmpty() {
        LinkedListDeque deq1 = new LinkedListDeque();
        LinkedListDeque deq2 = new LinkedListDeque(3);
        boolean expected1 = true;
        boolean expected2 = false;
        boolean isEmpty1 = deq1.isEmpty();
        boolean isEmpty2 = deq2.isEmpty();
        assertEquals(expected1, isEmpty1);
        assertEquals(expected2, isEmpty2);
    }
    @Test
    public void testAddFirst() {
        LinkedListDeque deq1 = new LinkedListDeque();
        LinkedListDeque deq2 = new LinkedListDeque(3);
        deq1.addFirst(3);
    }
    @Test
    public void testRemoveFirst() {
        LinkedListDeque deq1 = new LinkedListDeque(1);
        deq1.addLast(2);
        deq1.addLast(3);
        deq1.addLast(4);
        deq1.addLast(5);
        int expected = 2;
        LinkedListDeque deq2 = new LinkedListDeque();
        assertEquals(expected, deq1.removeFirst());
        assertEquals(null, deq2.removeFirst());
    }
    @Test
    public void testRemoveLast() {
        LinkedListDeque deq1 = new LinkedListDeque(1);
        deq1.addLast(2);
        deq1.addLast(3);
        deq1.addLast(4);
        deq1.addLast(5);
        int expected = 4;
        LinkedListDeque deq2 = new LinkedListDeque();
        assertEquals(expected, deq1.removeLast());
        assertEquals(null, deq2.removeLast());
    }
    @Test
    public void testPrint() {
        LinkedListDeque deq1 = new LinkedListDeque(1);
        deq1.addLast(2);
        deq1.addLast(3);
        deq1.addLast(4);
        deq1.addLast(5);
        deq1.printDeque();
    }
    @Test
    public void testGet() {
        LinkedListDeque deq1 = new LinkedListDeque(1);
        deq1.addLast(2);
        deq1.addLast(3);
        deq1.addLast(4);
        deq1.addLast(5);
        int expected3 = 3;
        assertEquals(expected3,deq1.get(2));
    }
    @Test
    public void testGetRecursive() {
        LinkedListDeque deq1 = new LinkedListDeque(1);
        deq1.addLast(2);
        deq1.addLast(3);
        deq1.addLast(4);
        deq1.addLast(5);
        int expected3 = 4;
        assertEquals(expected3,deq1.get(3));
    }
}
