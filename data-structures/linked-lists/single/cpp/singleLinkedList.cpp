#include <iostream>

/* *
* singly linked lists are data structures that consists of nodes that contain two parts: data and a pointer to the next node
* this means that each node is linked to the next node as seen in the illustration below:
*/

struct Node {
    int data;
    Node* next;
    Node(int value) : data(value), next(nullptr) {}
};

void insertAtBeginning(Node*& head, int value) {
    Node* newNode = new Node(value);
    newNode->next = head;
    head = newNode;
}

void insertAtEnd(Node*& head, int value) {
    Node* newNode = new Node(value);
    if (!head) { head = newNode; return; }
    Node* temp = head;
    while (temp->next) temp = temp->next;
    temp->next = newNode;
}

void deleteValue(Node*& head, int value) {
    if (!head) return;
    if (head->data == value) {
        Node* toDelete = head;
        head = head->next;
        delete toDelete;
        return;
    }
    Node* temp = head;
    while (temp->next && temp->next->data != value) temp = temp->next;
    if (temp->next) {
        Node* toDelete = temp->next;
        temp->next = temp->next->next;
        delete toDelete;
    }
}

void printList(Node* head) {
    Node* temp = head;
    while (temp) {
        std::cout << temp->data << " -> ";
        temp = temp->next;
    }
    std::cout << "nullptr\n";
}

int main() {
    Node* head = nullptr;  // initially empty list

    insertAtBeginning(head, 10);
    insertAtBeginning(head, 5);
    insertAtEnd(head, 20);
    insertAtEnd(head, 30);

    std::cout << "Linked List: ";
    printList(head);

    deleteValue(head, 20);
    std::cout << "After deleting 20: ";
    printList(head);

    return 0;
}
