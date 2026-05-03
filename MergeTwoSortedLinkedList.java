//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week8/problem/merge-two-sorted-linked-lists

public class MergeTwoSortedLinkedList {

    class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node sortedMerge(Node head1, Node head2) {
        
        Node t1 = head1;
        Node t2 = head2;
        
        Node head = new Node(-1);
        Node temp = head;
        
        while(t1 != null && t2 != null){
            if(t1.data  < t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        
        if(t1 == null){
            temp.next = t2;
        }
        
        if(t2 == null){
            temp.next = t1;
        }
        
        return head.next;
        
    }
}
