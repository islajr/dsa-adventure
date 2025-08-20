class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    /* constructor */
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // stack being initially empty
    }

    /* add new element to stack */
    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("stack overflow - failed to add value: " + value + " to stack.");
        }
        arr[++top] = value; // increment top and add value
        System.out.println("value: " + value + " added to stack.");
    }

    /* remove element from stack */
    void pop() {
        if (top == -1) {
            System.out.println("stack underflow - stack is empty.");
            throw new RuntimeException("stack is empty.");
        }
        int value = arr[top--]; // get value and decrement top
        System.out.println("value: " + value + " removed from stack.");
    }

    /* get the top element of the stack */
    int peek() {
        if (top == -1) {
            System.out.println("stack is empty.");
            throw new RuntimeException("stack is empty.");
        }
        return arr[top]; // return the top element
    }

    /* check if stack is empty */
    boolean isEmpty() {
        return top == -1; // true if top is -1
    }

    /* check if stack is full */
    boolean isFull() {
        return top == capacity - 1; // true if top is at the last index
    }

    /* display stack elements */
    void display() {
        if (isEmpty()) {
            System.out.println("stack is empty.");
        } else {
            System.out.println("stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.println("element " + (i + 1) + ": " + arr[i] + "");
            }
            System.out.println();
        }
    }

    /* main method */
    public static void main(String[] args) {
        Stack stack = new Stack(5); // create a stack of capacity 5
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display(); // display stack elements
        System.out.println("top element: " + stack.peek()); // get the top element

        // pop elements from the stack
        stack.pop();
        stack.display(); // display stack elements after popping
        System.out.println("top element after pop: " + stack.peek()); // get the top element after popping.
    }
}