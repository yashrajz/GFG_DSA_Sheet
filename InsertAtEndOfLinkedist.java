//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week8/problem/linked-list-insertion-1587115620

public class InsertAtEndOfLinkedist {

    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }


    public Node insertAtEnd(Node head, int x) {
        
        if(head == null){
            Node n = new Node(x);
            head = n;
            
            return head;
        }
        
        
        Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        Node node = new Node(x);
        temp.next = node;
        
        return head;
    }

}
