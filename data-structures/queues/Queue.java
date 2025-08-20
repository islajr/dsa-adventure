public class Queue {
    private Node front;
    private Node rear;
    private int size;

    /* constructor */
    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;

        if (front == null && rear == null) {
            System.out.println("queue is empty.");
            size = 0;
        } else if (front != null && rear == null) {
            System.out.println("queue has one element: " + front.getData());
            front.setIndex(0);
            size = 1;
        } else if (front == null && rear != null) {
            throw new IllegalArgumentException("front cannot be null if rear is not null.");
        } 
        else {
            size = 2;   // ideal situation
            front.setIndex(0);
            front.setNext(rear);
            rear.setIndex(1);
            rear.setNext(null);
        }
    } 
    
    void display() {
        Node current = front;
        int counter = 1;

        System.out.println("queue:");
        while (current != null) {
            System.out.println("node " + counter + " -> " + current.getData());
            current = current.getNext();
            counter++;
        }
    }

    /* adding new items to queue */
    void enqueue(String data) {
        Node newNode = new Node(data);

        if (front == null) { // if queue is empty...
            front = newNode;
            size = size + 1;
            System.out.println("enqueued: " + data);

        } else if (rear == null) { // if only one element exists...
            front.setNext(newNode);
            rear = newNode;
            size = size + 1;
            System.out.println("enqueued: " + data);

        } else {    // normal case with more than one element
            size = size + 1;
            newNode.setIndex(size - 1);
            newNode.setNext(null);
            rear.setNext(newNode);
            rear = newNode;
            System.out.println("enqueued: " + data);
        }
    }

    /* removing items from queue */
    void dequeue() {
        if (front == null) {
            System.out.println("empty queue: nothin to dequeue!");
        } else if (front != null && rear == null) {
            System.out.println("dequeued: " + front.getData());
            front = null;
            size = 0;
        } else {
            System.out.println("dequeued: " + front.getData());
            front = front.getNext();
            size = size - 1;
            
            if (size == 0) {    // contingency plan
                System.out.println("queue is now empty.");
                rear = null; // if queue is now empty, set rear to null
            } else {
                front.setIndex(0); // reset index of new front
                Node current = front;
                int index = 1;
                while (current != null && current.getNext() != null) {
                    current = current.getNext();
                    current.setIndex(index);
                    index++;
                }
            }
        }
    }

    /* main method */
    public static void main(String[] args) {
        Queue queue = new Queue(null, null);
        queue.enqueue("moseley");
        queue.enqueue("james");
        queue.enqueue("rashaun");
        queue.enqueue("dushane");
        queue.enqueue("sully");

        queue.display();

        // oh wait, moseley is NOT on the list.
        queue.dequeue();

        queue.display();
    }

    public static class Node {
        String data;
        Node next;
        int index;

        /* constructor */
        Node(String data) {
            this.data = data;
            this.next = null;
        }

        void setNext(Node next) {
            this.next = next;
        }

        Node getNext() {
            return this.next;
        }

        String getData() {
            return this.data;
        }

        void setIndex(int index) {
            this.index = index;
        }

        int getIndex() {
            return this.index;
        }

    }
}