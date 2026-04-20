public class InsertAtBeginingOfLinkedist {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    };



    public Node insertAtFront(Node head, int x) {
        
        Node newNode = new Node(x);
        
        newNode.next = head;
        head = newNode;
    
        return head;
    }
    
}
