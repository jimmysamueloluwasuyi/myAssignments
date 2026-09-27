package Stack;

import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    private int[] numbers = new int[5];
    private int count;

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(int number) {
        numbers[count++] = number;

    }

    public void pop() {
        numbers[--count] = 0;
    }

    public void peek() {
        numbers[count - 1]= numbers[count - 1];
    }
}
