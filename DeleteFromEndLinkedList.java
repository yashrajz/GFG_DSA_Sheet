//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week8/problem/deletion-at-the-end-of-a-linked-list

public class DeleteFromEndLinkedList {
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    public Node deleteFromEnd(Node head) {
        
        if(head == null || head.next == null){
            return null;
        }
        
        Node temp = head;
        
        while(temp.next.next != null){
            temp = temp.next;
        }
        
        temp.next = null;
        
        return head;
    }
}
