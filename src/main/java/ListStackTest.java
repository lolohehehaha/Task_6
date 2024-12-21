//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ListStackTest {
//
//    private ListStack<Integer> stack;
//
//    @BeforeEach
//    void setUp() {
//        stack = new ListStack<>();
//    }
//
//    @Test
//    void testEmptyStack() {
//        assertTrue(stack.empty());
//        stack.push(1);
//        assertFalse(stack.empty());
//    }
//
//
//    @Test
//    void testPeekOnEmptyStack() {
//        assertThrows(EmptyStackException.class, () -> stack.peek());
//    }
//
//    @Test
//    void testPeek() {
//        stack.push(1);
//        assertEquals(1, stack.peek());
//        stack.push(2);
//        assertEquals(2, stack.peek());
//    }
//
//    @Test
//    void testPopOnEmptyStack() {
//        assertThrows(EmptyStackException.class, () -> stack.pop());
//    }
//
//    @Test
//    void testPop() {
//        stack.push(1);
//        stack.push(2);
//        assertEquals(2, stack.pop());
//        assertEquals(1, stack.pop());
//        assertTrue(stack.empty());
//    }
//
//    @Test
//    void testPush() {
//        stack.push(1);
//        stack.push(2);
//        assertFalse(stack.empty());
//        assertEquals(2, stack.peek());
//    }
//
//    @Test
//    void testPushNull() {
//        assertNull(stack.push(null));
//        assertNull(stack.peek());
//    }
//
//    @Test
//    void testSearchExistingElement() {
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        assertEquals(0, stack.search(3));
//        assertEquals(1, stack.search(2));
//        assertEquals(2, stack.search(1));
//    }
//
//    @Test
//    void testSearchNonExistingElement() {
//        stack.push(1);
//        stack.push(2);
//        assertEquals(-1, stack.search(3));
//    }
//
//
//    @Test
//    void testSearchNull() {
//        stack.push(1);
//        stack.push(2);
//        stack.push(null);
//        assertEquals(0, stack.search(null));
//    }
//
//}