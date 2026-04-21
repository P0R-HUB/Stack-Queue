class MyStack {
    protected int top;
    protected int[] list;

    public MyStack(int size) {
        list = new int[size];
        top = -1;
    }

    public void push(int x) {
        if (top == list.length - 1) {
            System.out.println("Stack is full!");
            return;
        }
        list[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return list[top--];
    }
}