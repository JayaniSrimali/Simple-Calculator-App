package stackx;
class stackx{
    private int maxSize;
    private int[] stackArray;
    private int top;

    public stackx(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (!isFull()) {
            stackArray[++top] = item;
        } else {
            throw new StackOverflowError("Stack is full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int getCount() {
        return top + 1;
    }

    public int peek() {
        if (!isEmpty()) {
            int topItem = pop();
            push(topItem);
            return topItem;
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }
}

