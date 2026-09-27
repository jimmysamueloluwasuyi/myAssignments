package StackTest;

import Stack.MyStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {
    
    @Test
    public void testThat_Stack_isEmpty() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThat_ICanPush_ToStack() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThat_ICanPop_FromStack() {
        MyStack stack = new MyStack();
        stack.push(10);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThat_ICanPeek_FromStack() {
        MyStack stack = new MyStack();
        stack.push(10);
        assertFalse(stack.isEmpty());
        stack.peek();

    }

}



