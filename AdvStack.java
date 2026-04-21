class AdvStack extends MyStack {

    public AdvStack(int size) {
        super(size);
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return list[top];
    }

    public boolean search(int x) {
        for (int i = 0; i <= top; i++) {
            if (list[i] == x) return true;
        }
        return false;
    }

    public void clear() {
        top = -1;
    }

    public void doublePop() {
        pop();
        pop();
    }

    public void doublePush(int x, int y) {
        push(x);
        push(y);
    }
}