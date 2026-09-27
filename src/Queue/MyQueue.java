package Queue;

public class MyQueue {

    private int[] numbers = new int[5];
    private int count;
    private int front;


    public boolean isEmpty() {
        return count == 0;
    }


    public void enqueue(int number) {
        numbers[count++] = number;
    }

    public void dequeue(int number) {
        numbers[front++] = 0;
        --count;
    }


    public int peek() {
        return numbers[count - 1];

    }
}
