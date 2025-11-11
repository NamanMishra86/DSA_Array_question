package Linklist;

public class DoubleLinkedList {

    // Inner Node class
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;

    // Insert at the start
    public void insertStart(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    // Display the list
    public void display() {
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertStart(10);
        list.insertStart(20);
        list.insertStart(30);
         list.insertStart(40);
          list.insertStart(50);
           list.insertStart(60);
        list.display();
    }
}
