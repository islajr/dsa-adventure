import java.util.Stack;

/* *
 * LC 155: Min Stack
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * Implement the MinStack class:
 *      MinStack() initializes the stack object.
 *      void push(int val) pushes the element val onto the stack.
 *      void pop() removes the element on the top of the stack.
 *      int top() gets the top element of the stack.
 *      int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
*/
public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();

    public MinStack() {}
    
    public void push(int val) {
        if (val <= min) {
            stack.push(min);
            min = val;
        }

        stack.push(val);
    }
    
    public void pop() {
       if (stack.pop() == min)
        min = stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */