//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week8/problem/linked-list-insertion-at-beginning

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
