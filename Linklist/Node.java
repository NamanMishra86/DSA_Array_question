package Linklist;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linklist {
    Node head;


    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        
    }

    
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.add(10);
        list.add(20);
        list.add(30);
         list.add(40);
          list.add(50);
           list.add(60);
        list.display(); 
    }
}
