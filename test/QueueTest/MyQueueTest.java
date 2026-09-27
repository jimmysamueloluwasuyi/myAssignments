package QueueTest;

import Queue.MyQueue;
import org.junit.Test;

import static org.junit.Assert.*;


public class MyQueueTest {

    @Test
    public void testThat_Queue_Is_Empty() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.isEmpty());

    }

    @Test
    public void testThat_ICanPush_ToQueue() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.isEmpty());
        queue.enqueue(10);
        assertFalse(queue.isEmpty());

    }

    @Test
    public void testThat_ICan_FromQueue() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.isEmpty());
        queue.enqueue(10);
        assertFalse(queue.isEmpty());
        queue.dequeue(10);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThat_ICanpeek_FromQueue() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(20);
        assertFalse(queue.isEmpty());
        assertEquals(20 , queue.peek());
    }

}
