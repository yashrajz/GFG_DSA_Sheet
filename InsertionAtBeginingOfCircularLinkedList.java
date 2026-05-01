public class InsertionAtBeginingOfCircularLinkedList {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }


    public Node insertAtBeginning(Node tail, int key) {
        
        Node node = new Node(key);
        node.next = tail.next;
        tail.next = node;
        
        
        return node;
    }

}
