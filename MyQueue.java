class MyQueue {
    protected int front, rear;
    protected int[] list;

    public MyQueue(int size) {
        list = new int[size];
        front = 0;
        rear = -1;
    }

    public void enQueue(int x) {
        if (rear == list.length - 1) {
            System.out.println("Queue is full!");
            return;
        }
        list[++rear] = x;
    }

    public int deQueue() {
        if (front > rear) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return list[front++];
    }
}