public class InsertionAtDoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }

    public static Node insertAtBeginning(Node head, int x){
        Node newNode = new Node(x);

        if(head == null){
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }

    public static void printDLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtBeginning(head, 5);
        head = insertAtBeginning(head, 4);
        head = insertAtBeginning(head, 3);
        head = insertAtBeginning(head, 2);
        head = insertAtBeginning(head, 1);

        printDLL(head);
    }
}
