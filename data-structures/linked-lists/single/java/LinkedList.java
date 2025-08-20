

public class LinkedList {
    private final Node head;

    /* constructor */
    public LinkedList(Node head) {
        this.head = head;
    }

    void display() {
        Node current = head;
        int counter = 1;
        while (current != null) {
            System.out.println("Node " + counter + " -> " + current.getData());
            current = current.getNext();
            counter++;
        }
    }

    /* Node class */
    private static class Node {
        int data;
        Node next;

        /* constructor */
        Node(int data) {
            this.data = data;
            this.next = null;
        }

        void setNext(Node next) {
            this.next = next;
        }

        int getData() {
            return this.data;
        }

        Node getNext() {
            return this.next;
        }

        @Override
        public String toString() { 
            return String.valueOf(data);
        }
    }

     /* main method */
        public static void main(String[] args) {

            /* 
             * Linked List Structure:
             * A -> B -> C -> D -> E
             * where A, B, C, D, E are nodes with data 5, 10, 15, 20, and 25 respectively.
             * The next pointer of each node points to the next node in the list.
             * The last node's next pointer is null, indicating the end of the list.
             */
            Node A = new Node(5);
            Node B = new Node(10);
            Node C = new Node(15);
            Node D = new Node(20);
            Node E = new Node(25);

            A.setNext(B);
            B.setNext(C);
            C.setNext(D);
            D.setNext(E);
            E.setNext(null); // Last node's next is null

            // finishing up the linked list
            LinkedList list = new LinkedList(A);

            System.out.println("""
                    single linked list:
                    A -> B -> C -> D -> E
                    ----------------------
                    """);

            list.display(); // displaying the linked list
        }
}