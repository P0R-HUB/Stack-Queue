class AdvQueue extends MyQueue {

    public AdvQueue(int size) {
        super(size);
    }

    public boolean search(int x) {
        for (int i = front; i <= rear; i++) {
            if (list[i] == x) return true;
        }
        return false;
    }

    public void clear() {
        front = 0;
        rear = -1;
    }

    public int getSize() {
        if (rear < front) return 0;
        return rear - front + 1;
    }

    public boolean isFull() {
        return rear == list.length - 1;
    }

    public int getFront() {
        if (rear < front) return -1;
        return list[front];
    }

    public int getRear() {
        if (rear < front) return -1;
        return list[rear];
    }
}