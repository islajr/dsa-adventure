#include <iostream>
using namespace std;

/* *
    * stacks are data structures that follow the Last-In-First-Out (LIFO) principle.
    * this is especially useful in scenarios where one needs to undo something.
*/

class Stack {
    int top;
    int capacity;
    int* arr;

    public:

        // constructor
        Stack(int size) {
            capacity = size;
            arr = new int[capacity];
            top = -1;
        }
    
        // destructor to free up memory upon deallocation
        ~Stack() {
            delete[] arr;
        }

        // add elements to the top of the stack
        void push(int x) {
            if (top == capacity - 1) {
                cout << "stack overflow!\n" << endl;
                return;
            }

            arr[++top] = x;
        }

        // remove the first element in the stack
        void pop() {
            if (top == -1) {
                cout << "stack is empty!\n" << endl;
                return;
            }

            top--;
        }

        // return the top element
        int peek() {
            if (top == -1) {
                cout << "stack is empty!\n" << endl;
                return -1;
            }

            return arr[top];
        }

        // check if stack is empty
        bool isEmpty() {
            return top == -1;
        }
};

int main() {
    
    Stack s(4);

    s.push(1);
    s.push(13);
    s.push(8);
    s.push(20);

    cout << "top element: " << s.peek() << endl;

    s.pop();

    cout << "new 'top' after recent 'pop': " << s.peek() << endl;

    return 0;
    

}