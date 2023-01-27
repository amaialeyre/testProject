package lesson9task2;

public class OwnQueueImplementation implements OwnQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;


    public OwnQueueImplementation() {
        queue = new int[10];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public boolean add(Integer e) {
        if (isFull()) {
            return false;
        }
        queue[rear] = e;
        rear = (rear + 1) % queue.length;
        size++;
        return true;
    }

    @Override
    public Integer remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    @Override
    public Integer element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    private boolean isFull() {
        return size == queue.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}

