class Node {
    int data;
    Node address; // Reference to the next node

    public Node(int data) {
        this.data = data;
        this.address = null; 
    }
}

public class LinkedList {
    Node head; // Head of the linked list
    Node tail; // Tail of the linked list
    int size;  // Size of the linked list

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = tail = n;
        } else {
            tail.address = n; 
            tail = n; 
        }
        size++; 
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.address;
        }
    }

   

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList(); 
        System.out.println("Size of LinkedList"+list.size);
    }
}