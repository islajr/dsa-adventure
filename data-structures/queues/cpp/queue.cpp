#include <iostream>
using namespace std;

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

        void enqueue(int x) {
            if (isFull()) {
                cout << "queue overflow!\n" << endl;
                return;
            }

            rear = (rear + 1) % capacity;
            arr[rear] = x;
            count++;
        }

        void dequeue() {
            if (isEmpty()) {
                cout << "queue underflow!\n" << endl;
                return;
            }

            front = (front + 1) % capacity;
            count--;
        }

        int peek() {
            if (isEmpty()) {
                cout << "queue is empty!\n" << endl;
                return -1;
            }

            return arr[front];
        }

        int size() {
            return count;
        }

        bool isEmpty() {
            return count == 0;
        }

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
