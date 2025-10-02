#include <iostream>
using namespace std;

/* *
* queues are data structures that follow the First-In-First-Out (FIFO) principle
* this means that there is only one mode of entry (from behind) and exit (from the front)
* invariably, the first element to enter the queue will be the first to leave, and so on.
* 
* a queue implementation will have a front, rear, storage and size attribute as seen below:
*/

class Queue {
    int capacity;
    int count;
    int front;
    int rear;
    int* arr;

    public:

        // constructor
        Queue(int size) {
            arr = new int[size];
            capacity = size;
            front = 0;
            rear = -1;
            count = 0;
        }

        // destructor
        ~Queue() {
            delete[] arr;
        }

        // adding new elements to the queue
        void enqueue(int x) {
            if (isFull()) {
                cout << "queue overflow!\n" << endl;
                return;
            }

            rear = (rear + 1) % capacity;
            arr[rear] = x;
            count++;
        }

        // removing elements from the queue
        void dequeue() {
            if (isEmpty()) {
                cout << "queue underflow!\n" << endl;
                return;
            }

            front = (front + 1) % capacity;
            count--;
        }

        // returning the front element in the queue
        int peek() {
            if (isEmpty()) {
                cout << "queue is empty!\n" << endl;
                return -1;
            }

            return arr[front];
        }

        // returns the size of the queue
        int size() {
            return count;
        }

        // checks if the queue is empty
        bool isEmpty() {
            return count == 0;
        }

        // checks if the queue is full
        bool isFull() {
            return count == capacity;
        }
};

int main(int argc, char const *argv[])
{
    /* code */

    Queue q(5);
    q.enqueue(10);
    q.enqueue(7);
    q.enqueue(11);

    cout << "front element: " << q.peek() << endl;  // 10
    q.dequeue();
    cout << "front element after dequeue: " << q.peek() << endl; // 20

    q.enqueue(50);
    q.enqueue(60);
    q.enqueue(70);  // Queue Overflow since max size = 5

    cout << "Queue size: " << q.size() << endl; // 5

    return 0;
}
