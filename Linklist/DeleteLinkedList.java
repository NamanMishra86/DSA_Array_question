package Linklist;

public class DeleteLinkedList {

    // Inner class for Node
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    // Insert node at the start
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete a node by value
    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;

        // If head needs to be deleted
        if (temp.data == data) {
            head = temp.next;
            if (head != null)
                head.prev = null;
            System.out.println("Deleted: " + data);
            return;
        }

        // Traverse to find node to delete
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        // If node not found
        if (temp == null) {
            System.out.println("Node not found: " + data);
            return;
        }

        // Remove links
        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        System.out.println("Deleted: " + data);
    }

    // Print list forward
    public void printList() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        DeleteLinkedList dll = new DeleteLinkedList();

        dll.insertAtStart(10);
        dll.insertAtStart(20);
        dll.insertAtStart(30);
        dll.insertAtStart(40);

        dll.printList(); // 40 30 20 10

        dll.deleteNode(30);
        dll.printList(); // 40 20 10

        dll.deleteNode(40);
        dll.printList(); // 20 10
    }
}
