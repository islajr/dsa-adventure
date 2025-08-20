public class DoubleLinkedList {
    private final Node head;

    /* constructor */
    public DoubleLinkedList(Node head) {
        this.head = head;
    }

    void display() {
        Node current = head;
        int counter = 1;

        System.out.println("""
                double linked list:
                A -> B -> C -> D -> E
                ---------------------
                """);

        while (current != null) {
            System.out.println("node " + counter + " -> " + current.getData());
            System.out.println("\tprevious -> " + (current.getPrev() != null ? current.getPrev().getData() : "null"));
            System.out.println("\tnext -> " + (current.getNext() != null ? current.getNext().getData(): "null"));
            System.out.println("---------------------");
            System.out.println();
            current = current.getNext();
            counter++;
        }
    }

    private static class Node {
        int data;
        Node prev;
        Node next;

        /* constructor */
        Node (int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        void setNext(Node next) {
            this.next = next;
        }

        Node getNext() {
            return this.next;
        }

        void setPrev(Node prev) {
            this.prev = prev;
        }

        Node getPrev() {
            return this.prev;
        }

        int getData() {
            return this.data;
        }

        void prepare (Node prev, Node next) {
            setPrev(prev);
            setNext(next);
        }
    }
    /* main method */
    public static void main(String[] args) {
        Node A = new Node(5);
        Node B = new Node(10);
        Node C = new Node(15);
        Node D = new Node(20);
        Node E = new Node(25);

        A.prepare(null, B); // first node's prev is null
        B.prepare(A, C);
        C.prepare(B, D);
        D.prepare(C, E);
        E.prepare(D, null); // Last node's next is null

        // finishing up the double linked list
        DoubleLinkedList list = new DoubleLinkedList(A);

        list.display();
    }
}